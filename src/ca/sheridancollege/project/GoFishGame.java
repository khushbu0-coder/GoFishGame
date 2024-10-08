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

  public void dealCards(int numberOfCards) {
        for (int i = 0; i < numberOfCards; i++) {
            for (GoFishPlayer player : players) {
                GoFishCard card = (GoFishCard) deck.getCards().remove(0);
                player.addCardToHand(card);
            }
        }
    }

  public void playTurn(GoFishPlayer currentPlayer, GoFishPlayer otherPlayer, String requestedRank) {
        if (!currentPlayer.askForCard(otherPlayer, requestedRank)) {
            goFish(currentPlayer);
        }
        checkForBooks(currentPlayer);
    }

  public void goFish(GoFishPlayer player) {
        if (!deck.getCards().isEmpty()) {
            GoFishCard card = (GoFishCard) deck.getCards().remove(0);
            player.addCardToHand(card);
            System.out.println(player.getName() + " goes fishing and draws a card.");
        }
    }

  public void checkForBooks(GoFishPlayer player) {
        ArrayList<GoFishCard> hand = player.getHand();
        int[] rankCount = new int[13];

        for (GoFishCard card : hand) {
            int rankIndex = getRankIndex(card.getRank());
            if (rankIndex != -1) {
                rankCount[rankIndex]++;
                if (rankCount[rankIndex] == 4) {
                    player.incrementScore();
                    removeCardsFromHand(player, card.getRank());
                    System.out.println(player.getName() + " made a book of " + card.getRank() + "s!");
                }
            }
        }
    }






}
