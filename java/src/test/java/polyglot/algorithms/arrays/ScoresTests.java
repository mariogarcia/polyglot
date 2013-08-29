package polyglot.algorithms.arrays;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertArrayEquals;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.containsString;

import org.junit.Test;
import java.util.List;
import java.util.Arrays;

public class ScoresTests {

  @Test
  public void testAddNewScores(){

      Scores scores = new Scores();

      GameEntry john = new GameEntry("John",340);
      GameEntry peter = new GameEntry("Peter",450);
      GameEntry linda = new GameEntry("Linda",250);

      scores.add(john);
      scores.add(peter);
      scores.add(linda);

      assertThat(scores.entries.length,is(10));
      assertThat(scores.numEntries,is(3));
  }

  @Test
  public void testKeepHighestAsTheFirst(){
      
      Scores scores = new Scores();

      GameEntry john = new GameEntry("John",340);
      GameEntry peter = new GameEntry("Peter",450);
      GameEntry linda = new GameEntry("Linda",250);

      scores.add(john);
      scores.add(peter);
      scores.add(linda);

      assertThat(scores.entries[0].getName(),is("Peter"));
  
  }

  @Test
  public void testWhenScoresAreFullTheLastOneIsChanged(){
  
      Scores scores = new Scores();

      List<Integer> range = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

      for(Integer next : range){
          scores.add(new GameEntry("Player" + next,next * 2));
      }

      scores.add(new GameEntry("Player11",3));
      scores.add(new GameEntry("Player12",3));
  
      assertThat(scores.numEntries,is(10));
      assertThat(scores.toString(),containsString("Player11"));
      assertThat(scores.toString(),not(containsString("Player12")));
      assertThat(scores.entries[scores.entries.length - 1].getName(),is("Player11"));
  }

  @Test
  public void testRemovingAGivenEntry() throws ScoresOutOfBoundsException {
  
      Scores scores = new Scores();

      GameEntry john = new GameEntry("John",340);

      scores.add(john);

      GameEntry removedEntry = scores.remove(0);

      assertThat(removedEntry,notNullValue());
      assertThat(removedEntry.getName(),is("John"));
      assertThat(scores.numEntries,is(0));
  
  }

  @Test
  public void testRemovingAndMovingAllRemainingEntriesToTheRight() throws ScoresOutOfBoundsException {
  
      Scores scores = new Scores();

      GameEntry john = new GameEntry("John",340);
      GameEntry peter = new GameEntry("Peter",450);
      GameEntry linda = new GameEntry("Linda",250);

      scores.add(john);
      scores.add(peter);
      scores.add(linda); 

      assertThat(scores.numEntries,is(3));
      assertThat(scores.remove(0).getName(),is("Peter"));
      assertThat(scores.numEntries,is(2));
      assertThat(scores.remove(0).getName(),is("John"));
      assertThat(scores.numEntries,is(1));
      assertThat(scores.remove(0).getName(),is("Linda"));
      assertThat(scores.numEntries,is(0));

  }

  @Test(expected=ScoresOutOfBoundsException.class)
  public void testExceptionThrownWhenAccessingOutOfBoundsUpper() throws ScoresOutOfBoundsException {
  
      Scores scores = new Scores();

      GameEntry john = new GameEntry("John",340);

      scores.remove(20);

  }

  @Test(expected=ScoresOutOfBoundsException.class)
  public void testExceptionThrownWhenAccessingOutOfBoundsLower() throws ScoresOutOfBoundsException {
  
      Scores scores = new Scores();

      GameEntry john = new GameEntry("John",340);

      scores.remove(-20);

  }

  @Test
  public void testAscSortingAnArray(){

      int[] randomNumbers = new int[]{19,30,18,31,20,22,7,1,4,3};
      int arrayLength = randomNumbers.length;

      for(int i = 0 ; i < arrayLength ; i++){
          int current = randomNumbers[i];
          int j = i - 1;
          while((j >= 0) && (randomNumbers[j] > current)){
              randomNumbers[j+1] = randomNumbers[j--];
              randomNumbers[j+1] = current;
          }
      }

      System.out.println(Arrays.toString(randomNumbers)); 

      assertArrayEquals(randomNumbers,new int[]{1,3,4,7,18,19,20,22,30,31});

  }


}
