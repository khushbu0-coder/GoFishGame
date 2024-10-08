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

private void initializeDeck() {
        String[] suits = {"hearts", "diamonds", "clubs", "spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        ArrayList<Card> cards = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new GoFishCard(suit, rank));
            }
        }
        deck.setCards(cards);
        deck.shuffle();
    }

  



}
