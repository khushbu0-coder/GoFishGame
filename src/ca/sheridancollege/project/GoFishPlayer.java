package ca.sheridancollege.project;

public class GoFishPlayer extends Player{

  private ArrayList<GoFishCard>hand;  
  private int score;  // number of books(collection of 4cards of same rank)

  //Constructor

  public GoFishPlayer(String name){
    super(name);
    this.hand = new ArrayList<>();
    this.score = 0;
  }

  //Getters

  public ArrayList<GoFishCard> getHand(){
    return hand;
  }

  public int getScore(){
    return score;
  }
  
}
