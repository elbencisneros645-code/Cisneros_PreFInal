/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cisneros_prefinalexam;

/**
 *
 * @author User
 */
public class Player {
    
  
    private String PlayerId;
    private String name;
    private String teamName;
    private double score;

   
    public Player(String PlayerId, String name , String teamName, double score) {
        this.PlayerId = PlayerId;
        this.name = name;
        this.teamName = teamName;
        this.score = score;
    }

    
    public String getPlayerId() {
        return PlayerId;
    }

    public String getName() {
        return name;
    }

    public String getTeamName() {
        return teamName;
    }

    public double getScore() {
        return score;
    }

    
    @Override
    public String toString() {
        return String.format(
            "Player ID: %s | Name: %-15s | Team: %-12s | Score: %.2f",
            PlayerId, name, teamName, score
        );
    }
}


   
   
    

