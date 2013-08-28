package polyglot.algorithms.arrays;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
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

}
