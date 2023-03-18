package com.mycompany.guessinggame;

public class Credits {
    String[] studentNames = {"Eren Geçer", "Okan Toga", "Gökay Yener", "Yener Can Taş", "Zeynep Albayrak", "Ayça Nur Menteş", "Cemre Çiçek"};
    String[] studentIDs = {"210209051", "210209034", "200209051", "200209047","200209039", "200209060", "200209005"};

    public Credits(){
        
    }
    
    public void creditsTBM(){  //Top Bottom Middle
        System.out.println("+-------------------------------+");
    }

    public void creditsStudent(){
        creditsTBM();
        for(int i = 0 ; i < 7 ; i++){
            System.out.println("Student Name: " + studentNames[i] + "\nStudent ID: " + studentIDs[i]);
            creditsTBM();
        }
    }
}
