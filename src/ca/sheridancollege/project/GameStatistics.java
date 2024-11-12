package ca.sheridancollege.project;  

import java.util.HashMap;  

public class GameStatistics {  
    private HashMap<GoFishPlayer, Integer> playerScores;  
    private int totalRounds;  

    public GameStatistics() {  
        playerScores = new HashMap<>();  
        totalRounds = 0;  
    }  

    public void addPlayer(GoFishPlayer player) {  
        playerScores.put(player, 0);  
    }  

    public void updateScore(GoFishPlayer player) {  
        playerScores.put(player, playerScores.get(player) + 1);  
    }  

    public void incrementRounds() {  
        totalRounds++;  
    }  

    public int getTotalRounds() {  
        return totalRounds;  
    }  

    public HashMap<GoFishPlayer, Integer> getPlayerScores() {  
        return playerScores;  
    }  
}
