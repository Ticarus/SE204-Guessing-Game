package com.mycompany.guessinggame;

import java.util.Scanner;

public class Menu {
    private int choice;
    
    Scanner sc = new Scanner(System.in);
    
    public Menu(){
        
    }
    
    public Menu(int choice){
        this.choice = choice;
    }
    
    public int getChoice(){
        return this.choice;
    }
    
    public void setChoice(int choice){
        this.choice = choice;
    }
    
    public void menu(){
        System.out.println("MENU");
        System.out.println("----");
        System.out.println("1. Guess the Number");
        System.out.println("2. Guess the Alphabet");
        System.out.println("3. High Score");
        System.out.println("4. Credits");
        System.out.println("5. Exit\n");
        System.out.print("Enter your choice:");
        
        this.choice = sc.nextInt();
    }
}
