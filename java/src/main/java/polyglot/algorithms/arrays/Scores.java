package polyglot.algorithms.arrays;

import java.util.Arrays;

public class Scores {

  public static final int maxEntries = 10;

  protected int numEntries;
  protected GameEntry[] entries;

  public Scores(){
    this.entries = new GameEntry[maxEntries];
    this.numEntries = 0;
  }

  public void add(GameEntry entry){

      int newScore = entry.getScore(); 
      boolean isFull = numEntries == entries.length;

      if(isFull){
        if (newScore <= entries[numEntries - 1].getScore()){
          return; 
        }
      } else {
        numEntries++;
      }

      int index = numEntries - 1;

      for(; (index >= 1) && (newScore > entries [index - 1].getScore()); index--){
        entries[index] = entries[index - 1];
      }

      entries[index] = entry;

  }

  public GameEntry remove(int index) throws ScoresOutOfBoundsException {

    if (index < 0 || index >= entries.length){
      throw new ScoresOutOfBoundsException();
    }

    GameEntry removedEntry = entries[index];
    numEntries--;
    entries[index] = null;

    int startPoint = index;

    for (; startPoint < numEntries ; startPoint ++){
       entries[startPoint] = entries[startPoint + 1];
    }

    return removedEntry;
  }

  public String toString(){
      return Arrays.asList(entries).toString();
  }

}
