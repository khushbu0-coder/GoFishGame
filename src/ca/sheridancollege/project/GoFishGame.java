public class GoFishGame extends Game {  
    private CardDeck deck; // Composition  
    private ArrayList<GoFishPlayer> players; // Aggregation  
    private int rounds; // Number of rounds to play  
    private static final int MAX_ROUNDS = 4; // Total rounds to play  

    public GoFishGame(String name, ArrayList<GoFishPlayer> players) {  
        super(name);  
        this.players = players;  
        this.rounds = 0; // Initialize rounds  
        this.deck = new CardDeck(); // Initialize the deck  
    }  

    @Override  
    public void play() {  
        while (rounds < MAX_ROUNDS) {  
            System.out.println("Round " + (rounds + 1) + ":");  
            dealCards(7); // Deal cards at the start of each round  
            for (GoFishPlayer player : players) {  
                // Implement a turn for each player  
                // Example: player.play();  
                // You would need to define how each player plays their turn  
            }  
            rounds++;  
        }  
        declareWinner(); // Declare the winner after all rounds  
    }  

    public void dealCards(int numberOfCards) {  
        for (int i = 0; i < numberOfCards; i++) {  
            for (GoFishPlayer player : players) {  
                GoFishCard card = (GoFishCard) deck.drawCard();  
                if (card != null) {  
                    player.addCardToHand(card);  
                }  
            }  
        }  
    }  
}
