package com.mycompany.guessinggame;


import java.lang.System;

public class GuessingGame {

    public static void main(String[] args) {
        Menu menu = new Menu();
        StartMenu startMenu = new StartMenu();
        HighScore highScore = new HighScore();
        
        do{      
            menu.menu();
            
            if(menu.getChoice() == 1){
                do{
                    startMenu.startMenu();
                    GuessTheNumber guessTheNumber = new GuessTheNumber(startMenu.getChoice());
                    guessTheNumber.guessTheNumber();
            
                    if(guessTheNumber.getChances() >= highScore.getGTNHighScore()){
                        highScore.setGTNHighScore(guessTheNumber.getChances());
                    }
                    
                    if(guessTheNumber.getIsToMainMenu()){
                        startMenu.setIsToMainMenuN(true);
                    }
                }while(!startMenu.getIsToMainMenuN());
                
                startMenu.setIsToMainMenuN(false);
            }
            else if(menu.getChoice() == 2){
                do{
                    startMenu.startMenu();
                    GuessTheAlphabet guessTheAlphabet = new GuessTheAlphabet(startMenu.getChoice());
                    guessTheAlphabet.guessTheAlphabet();
            
                    if(guessTheAlphabet.getChances() >= highScore.getGTAHighScore()){
                        highScore.setGTAHighScore(guessTheAlphabet.getChances());
                    }
                    
                    if(guessTheAlphabet.getIsToMainMenu()){
                        startMenu.setIsToMainMenuA(true);
                    }
                }while(!startMenu.getIsToMainMenuA());
                
                startMenu.setIsToMainMenuA(false);
            }
            else if(menu.getChoice() == 3){
                highScore.printHighScore();
            }
            else if(menu.getChoice() == 4){
                System.out.println("===============================\n||Student Name: Okan Toga    ||\n||Student ID:210209034       ||");
                System.out.println("===============================\n||Student Name: Eren Geçer   ||\n||Student ID:210209051       ||");
                System.out.println("===============================\n||Student Name: Yener Can Taş||\n||Student ID:200209034       ||");
                System.out.println("===============================\n||Student Name: Gökay Yener  ||\n||Student ID:200209051       ||\n===============================");
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