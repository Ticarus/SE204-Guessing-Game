package com.mycompany.guessinggame;

import java.util.Scanner;

public class StartMenu {
    private int choice;
    private boolean isToMainMenuN,isToMainMenuA;
    
    Scanner sc = new Scanner(System.in);
    
    public StartMenu(){
        
    }
    
    public StartMenu(int choice){
        this.choice = choice;
    }
    
    public int getChoice(){
        return this.choice;
    }
    
    public void setChoice(int choice){
        this.choice = choice;
    }
    
    public boolean getIsToMainMenuN(){
        return this.isToMainMenuN;
    }
    
    public void setIsToMainMenuN(boolean isToMainMenuN){
        this.isToMainMenuN = isToMainMenuN;
    }
    
    public boolean getIsToMainMenuA(){
        return this.isToMainMenuA;
    }
    
    public void setIsToMainMenuA(boolean isToMainMenuA){
        this.isToMainMenuA = isToMainMenuA;
    }
    
    public void startMenu(){
        System.out.println("Start Menu");
        System.out.println("----------");
        System.out.println("Select a difficulty level");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");
        System.out.println("4. Return to main menu");
        System.out.print("==> ");
        
        this.choice = sc.nextInt();
    }
}
