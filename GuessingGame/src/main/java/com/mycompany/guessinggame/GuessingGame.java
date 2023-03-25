package com.mycompany.guessinggame;

import java.lang.System;

public class GuessingGame {

    public static void main(String[] args) {
        Menu menu = new Menu();
        StartMenu startMenu = new StartMenu();
        HighScore highScore = new HighScore();
        Credits credits = new Credits();
        
        do{      
            menu.menu();
            
            if(menu.getChoice() == 1){
                do{
                    startMenu.startMenu();
                    GuessTheNumber guessTheNumber = new GuessTheNumber(startMenu.getChoice());
                    guessTheNumber.guessTheNumber();
            
                    if(guessTheNumber.getScore() >= highScore.getGTNHighScore()){
                        highScore.setGTNHighScore(guessTheNumber.getScore());
                    }
                    
                    if(guessTheNumber.getIsToMainMenu()){
                        startMenu.setIsToMainMenuN(true);
                    }
                }while(!startMenu.getIsToMainMenuN());  //getIsToMainMenuNumber
                
                startMenu.setIsToMainMenuN(false);
            }
            else if(menu.getChoice() == 2){
                do{
                    startMenu.startMenu();
                    GuessTheAlphabet guessTheAlphabet = new GuessTheAlphabet(startMenu.getChoice());
                    guessTheAlphabet.guessTheAlphabet();
            
                    if(guessTheAlphabet.getScore() >= highScore.getGTAHighScore()){
                        highScore.setGTAHighScore(guessTheAlphabet.getScore());
                    }
                    
                    if(guessTheAlphabet.getIsToMainMenu()){
                        startMenu.setIsToMainMenuA(true);
                    }
                }while(!startMenu.getIsToMainMenuA());  //getIsToMainMenuAlphabet
                
                startMenu.setIsToMainMenuA(false);
            }
            else if(menu.getChoice() == 3){
                highScore.printHighScore();
            }
            else if(menu.getChoice() == 4){
                credits.creditsStudent();
            }
            else if(menu.getChoice() == 5){
                System.exit(0);
            }
            else{
                System.out.println("Invalid option, Please try again.");
            }
        }while(true);
    }
}