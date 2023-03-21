package com.mycompany.guessinggame;

import java.util.Scanner;
import java.util.Random;

public class GuessTheAlphabet {
    private int number,choice,chances;
    private int vowelCount = 5;
    private int consonantCount = 21;
    private int alphabetCount = 25;
    private char vowels[] = {'a','e','i','o','u'};
    private char[] consonants = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
    private char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private char letter;
    private char[] l = new char[5];
    private int score = 0;
    private boolean isToMainMenu,hasWon;
    
    Scanner sc = new Scanner(System.in);
    Random rng = new Random();
    
    public GuessTheAlphabet(int choice){
        this.choice = choice;
    }
    
    public int getNumber(){
        return this.number;
    }
    
    public void setNumber(int number){
        this.number = number;
    }
    
    public int getChoice(){
        return this.choice;
    }
    
    public void setChoice(int choice){
        this.choice = choice;
    }
    
    public int getChances(){
        return this.chances;
    }
    
    public void setChances(int chances){
        this.chances = chances;
    }
    
    public char getLetter(){
        return this.letter;
    }
    
    public void setLetter(char letter){
        this.letter = letter;
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
    
    public void instructionsTop(){
        System.out.println("Guess the Alphabet");
        System.out.println("----------------");
        System.out.println("Instructions:");
    }
    
    public void instructionsMiddle(){
        System.out.println("2. You are allowed to make one guess at a time.");
    }
    
    public void instructionsBottom(){
        System.out.println("4. Once you have used up all your chances, you lose the game.");
        System.out.println("\nGood Luck");
    }
    public void instructions(){
        if(this.choice == 1){
            this.chances = 2;
            
            instructionsTop();
            System.out.println("1. Guess the vowel alphabet.");
            instructionsMiddle();
            System.out.println("3. Each game has " + this.chances + " chances to guess the correct vowel.");
            instructionsBottom();
        }
        else if(this.choice == 2){
            this.chances = 4;
            
            instructionsTop();
            System.out.println("1. Guess the consonant alphabet.");
            instructionsMiddle();
            System.out.println("3. Each game has " + this.chances + " chances to guess the correct consonant.");
            instructionsBottom();
        }
        else if(this.choice == 3){
            this.chances = 5;
            
            instructionsTop();
            System.out.println("1. Guess the alphabet.");
            instructionsMiddle();
            System.out.println("3. Each game has " + this.chances + " chances to guess the correct alphabet.");
            instructionsBottom();
        }
    }
    
    public void rvg(){      //random vowel generator
        if(this.choice == 1){
            this.number = rng.nextInt(0, this.vowelCount);
            
            for(int i = 0 ; i < this.vowelCount ; i++){
                if(this.number == i){
                    this.letter = this.vowels[i];
                }
            }
        }
    }
    
    public void rcg(){      //random consonant generator
        if(this.choice == 2){
            this.number = rng.nextInt(0, this.consonantCount);
            
            for(int i = 0 ; i < this.consonantCount ; i++){
                if(this.number == i){
                    this.letter = this.consonants[i];
                }
            }
        }
    }
    
    public void rag(){      //random alphabet generator
        if(this.choice == 3){
            this.number = rng.nextInt(0, this.alphabetCount);
            
            for(int i = 0 ; i < this.alphabetCount ; i++){
                if(this.number == i){
                    this.letter = this.alphabet[i];
                }
            }
        }
    }
    
    public void guessTheAlphabet(){
        if(this.choice == 1){
            instructions();
            
            rvg();
            
            for(this.chances = 2 ; chances > 0 ; chances--){
                System.out.println("Enter a vowel: " + this.chances + " left. What is the letter?");
                //This system starts to fill the array from the element l[1] to the element l[0]
                l[this.chances - 1] = sc.next().charAt(0);
                Character.toLowerCase(l[this.chances - 1]);
                
                if(l[this.chances - 1] == this.letter){
                    this.score++;
                    System.out.println("Correct! You've won the game with just " + this.score + " tries.");
                    this.hasWon = true;
                    break;
                }
                else if(l[this.chances - 1] < this.letter){
                    this.score++;
                    System.out.println("Wrong! Your guess was too low");
                }
                else if(l[this.chances - 1] > this.letter){
                    this.score++;
                    System.out.println("Wrong! Your guess was too high");
                }
                else{
                    System.out.println("Error Code:152176");
                    break;
                }    
            }
            
            if(this.chances == 0 && !this.hasWon){
                    System.out.println("You lost the game");
            }
        }
        else if(choice == 2){
            instructions();
            
            rcg();
            
            for(this.chances = 4 ; chances > 0 ; chances--){
                System.out.println("Enter a consonant: " + this.chances + " left. What is the letter?");
                //This system starts to fill the array from the element l[3] to the element l[0]
                l[this.chances - 1] = sc.next().charAt(0);
                Character.toLowerCase(l[this.chances - 1]);
                
                if(l[this.chances - 1] == this.letter){
                    this.score++;
                    System.out.println("Correct! You've won the game with just " + this.score + " tries.");
                    this.hasWon = true;
                    break;
                }
                else if(l[this.chances - 1] != this.letter){
                    this.score++;
                }
                else{
                    System.out.println("Error Code:254273");
                    break;
                }    
            }
            
            if(this.chances == 0 && !this.hasWon){
                System.out.println("You lost the game");
            }
        }
        else if(this.choice == 3){
            instructions();
            
            rag();
            
            for(this.chances = 5 ; chances > 0 ; chances--){
                System.out.println("Enter an alphabet letter: " + this.chances + " left. What is the letter?");
                //This system starts to fill the array from the element l[4] to the element l[0]
                l[this.chances - 1] = sc.next().charAt(0);
                Character.toLowerCase(l[this.chances - 1]);
                
                if(l[this.chances - 1] == this.letter){
                    this.score++;
                    System.out.println("Correct! You've won the game with just " + this.score + " tries.");
                    this.hasWon = true;
                    break;
                }
                else if(l[this.chances - 1] != this.letter){
                    this.score++;
                }
                else{
                    System.out.println("Error Code:363382");
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

