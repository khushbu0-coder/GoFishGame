package ca.sheridancollege.project;


import java.util.ArrayList;
import java.util.Collections;


public class GoFishGame extends Game(){
  private GroupOfCards deck;
  private ArrayList<GoFishPlayer>players;


public GoFishGame(String name, ArrayList<GoFishPlayer>players){
  super(name);
  this.players=players;
  deck = new GroupOfCards(52);
  initialize deck();

}



}
