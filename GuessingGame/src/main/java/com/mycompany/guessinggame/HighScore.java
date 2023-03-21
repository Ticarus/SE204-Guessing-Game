package com.mycompany.guessinggame;

public class HighScore {
    private int gtnHighScore;  //gtn = guess the number || gta = guess the alphabet 
    private int gtaHighScore;

    public HighScore(){
        
    }
    
    public int getGTNHighScore(){
        return this.gtnHighScore;
    }
    
    public void setGTNHighScore(int gtnHighScore){
        this.gtnHighScore = gtnHighScore;
    }
    
    public int getGTAHighScore(){
        return this.gtaHighScore;
    }
    
    public void setGTAHighScore(int gtaHighScore){
        this.gtaHighScore = gtaHighScore;
    }
    
    public void printHighScore(){
        System.out.println("Guess the number best score: " + this.gtnHighScore + " chances used up.");
        System.out.println("Guess the alphabet best score: " + this.gtaHighScore + " chances used up.");
    }
}
