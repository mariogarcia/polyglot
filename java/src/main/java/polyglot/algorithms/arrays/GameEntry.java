package polyglot.algorithms.arrays;

public class GameEntry{

  protected String name;
  protected int score;

  public GameEntry(String name,int score){

    this.name = name;
    this.score = score;
    
  }

  public String getName(){
    return this.name;
  }

  public int getScore(){
    return this.score;
  }

  public String toString(){
    return "(" + name + ", " + score + ")";
  }

} 
