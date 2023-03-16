package com.mycompany.guessinggame;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    private int number,chances,choice;
    private int score = 0;
    private int[] n = new int[5];
    private boolean isToMainMenu,hasWon;
    
    Scanner sc = new Scanner(System.in);
    Random rng = new Random();
    
    public GuessTheNumber(int choice){
        this.choice = choice;
    }
    
    public int getNumber(){
        return this.number;
    }
    
    public void setNumber(int number){
        this.number = number;
    }
    
    public int getChances(){
        return this.chances;
    }
    
    public void setChances(int chances){
        this.chances = chances;
    }
    
    public int getChoice(){
        return this.choice;
    }
    
    public void setChoice(int choice){
        this.choice = choice;
    }
    
    public int getScore(){
        return this.score;
    }
    
    public void setScore(int score){
        this.score = score;
    }
    
    public boolean getIsToMainMenu(){
        return this.isToMainMenu;
    }
    
    public void setIsToMainMenu(boolean isToMainMenu){
        this.isToMainMenu = isToMainMenu;
    }
    
    public boolean getHasWon(){
        return this.hasWon;
    }
    
    public void setHasWon(boolean hasWon){
        this.hasWon = hasWon;
    }
    
    public void instructions(){
        if(this.choice == 1){
            this.chances = 5;
        }
        else if(this.choice == 2){
            this.chances = 4;
        }
        else if(this.choice == 3){
            this.chances = 3;
        }
        else{
            System.out.println("Invalid option, Please try again.");
        }
        
        System.out.println("Guess the Number");
        System.out.println("----------------");
        System.out.println("Instructions:");
        System.out.println("1. Guess the number based on the gaven range.");
        System.out.println("2. You are allowed to make one guess at a time.");
        System.out.println("3. Each game has " + this.chances + " chances to guess the correct number.");
        System.out.println("4. Once you have used up all your chances, you lose the game.");
        System.out.println("\nGood Luck");
    }
    
    public void guessTheNumber(){
        if(this.choice == 1){
            instructions();
            
            this.number = rng.nextInt(1,16);
            
            for(this.chances = 5; this.chances > 0 ; this.chances--){
                System.out.println("Enter guess number from 1 to 15 . " + this.chances + " chances left");
                
                n[this.chances - 1] = sc.nextInt();
                //This system starts to fill the array from the element n[4] to the element n[0] 
                if(n[this.chances - 1] == this.number){
                    this.score++;
                    System.out.println("Correct! You've won the game with just " + this.score + " tries.");
                    this.hasWon = true;
                    break;
                }
                else if(n[this.chances - 1] < this.number){
                    this.score++;
                    System.out.println("Wrong! Your guess was too low");
                }
                else if(n[this.chances - 1] > this.number){
                    this.score++;
                    System.out.println("Wrong! Your guess was too high");
                }
                else{
                    System.out.println("Error code:97120");
                    break;
                }
            }
            
            if(this.chances == 0 && !this.hasWon){
                System.out.println("You lost the game");
            }
        }
        else if(this.choice == 2){
            instructions();
            
           this.number = rng.nextInt(1,21);
            
            for(this.chances = 4; this.chances > 0 ; this.chances--){
                System.out.println("Enter guess number: (1 to 20). " + this.chances + " chances left");
                
                n[this.chances - 1] = sc.nextInt();
                //This system starts to fill the array from the element n[3] to the element n[0] 
                if(n[this.chances - 1] == this.number){
                    this.score++;
                    System.out.println("Correct! You've won the game with just " + this.score + " tries.");
                    this.hasWon = true;
                    break;
                }
                else if(n[this.chances - 1] != this.number){
                    this.score++;
                }
                else{
                    System.out.println("Error code:131149");
                    break;
                }
            }
            
            if(this.chances == 0 && !this.hasWon){
                System.out.println("You lost the game");
            } 
        }
        else if(this.choice == 3){
            instructions();
            
            this.number = rng.nextInt(1,41);
            
            for(this.chances = 3; this.chances > 0 ; this.chances--){
                System.out.println("Enter guess number from  1 to 40 . " + this.chances + " chances left");
                
                n[this.chances - 1] = sc.nextInt();
                //This system starts to fill the array from the element n[2] to the element n[0] 
                if(n[this.chances - 1] == this.number){
                    this.score++;
                    System.out.println("Correct! You've won the game with just " + this.score + " tries.");
                    this.hasWon = true;
                    break;
                }
                else if(n[this.chances - 1] != this.number){
                    this.score++;
                }
                else{
                    System.out.println("Error code:160178");
                    break;
                }
            }
            
            if(this.chances == 0 && !this.hasWon){
                System.out.println("You lost the game");
            }
        }
        else if(this.choice == 4){
            this.isToMainMenu = true;
        }
        else{
            System.out.println("Invalid option, Please try again.");
        }
    }
}
