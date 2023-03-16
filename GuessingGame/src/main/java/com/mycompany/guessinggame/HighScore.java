package com.mycompany.guessinggame;

public class HighScore {
    private int gtnHighScore;  //gtn = guess the number || gta = guess the alphabet 
    private int gtaHighScore;
    //private int gtnHighScore1,gtnHighScore2,gtaHighScore1,gtaHighScore2;
    public HighScore(){
        
    }
    
    public int getGTNHighScore(){
        return this.gtnHighScore;
    }
    
    public void setGTNHighScore(int gtnHighScore){
        this.gtnHighScore = gtnHighScore;
    }
    /*
    public int getGTNHighScore1(){
        return this.gtnHighScore1;
    }
    
    public void setGTNHighScore1(int gtnHighScore1){
        this.gtnHighScore1 = gtnHighScore1;
    }
    
    public int getGTNHighScore2(){
        return this.gtnHighScore2;
    }
    
    public void setGTNHighScore2(int gtnHighScore2){
        this.gtnHighScore2 = gtnHighScore2;
    }
    */
    public int getGTAHighScore(){
        return this.gtaHighScore;
    }
    
    public void setGTAHighScore(int gtaHighScore){
        this.gtaHighScore = gtaHighScore;
    }
    /*
    public int getGTAHighScore1(){
        return this.gtaHighScore1;
    }
    
    public void setGTAHighScore1(int gtaHighScore1){
        this.gtaHighScore1 = gtaHighScore1;
    }
    
    public int getGTAHighScore2(){
        return this.gtaHighScore2;
    }
    
    public void setGTAHighScore2(int gtaHighScore2){
        this.gtaHighScore2 = gtaHighScore1;
    }
    */
    /*
    public void calculateHighScore(){
        if(this.gtnHighScore1 >= this.gtnHighScore2){
            this.gtnHighScore = this.gtnHighScore2;
        }
        if(this.gtaHighScore1 >= this.gtaHighScore2){
            this.gtaHighScore = this.gtaHighScore2;
        }
    }
    */
    public void printHighScore(){
        System.out.println("Guess the number best score: " + this.gtnHighScore + " chances used up.");
        System.out.println("Guess the alphabet best score: " + this.gtaHighScore + " chances used up.");
    }
}
