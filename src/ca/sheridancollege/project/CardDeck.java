package ca.sheridancollege.project;  

import java.util.ArrayList;  
import java.util.Collections;  

public class CardDeck {  
    private ArrayList<Card> cards;  

    public CardDeck() {  
        cards = new ArrayList<>();  
        initializeDeck();  
        shuffle();  
    }  

    private void initializeDeck() {  
        String[] suits = {"hearts", "diamonds", "clubs", "spades"};  
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};  
        
        for (String suit : suits) {  
            for (String rank : ranks) {  
                cards.add(new GoFishCard(rank, suit));  
            }  
        }  
    }  

    public void shuffle() {  
        Collections.shuffle(cards);  
    }  

    public Card drawCard() {  
        return cards.isEmpty() ? null : cards.remove(0);  
    }  

    public int getRemainingCards() {  
        return cards.size();  
    }  
}
