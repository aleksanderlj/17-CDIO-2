//******************************************************************
//  Player.java        Author: Gruppe 17
//
//  Repræsenterer én spiller med et navn. Indeholder også en
//  reference til et Account-objekt som er hans konto.
//******************************************************************

package spil;

public class Player {

    private Account konto;
    private String name;

    //----------------------------------------------------------------------------------------------------------
    // Constructor til Player. Spillerens navn angives og et nyt Account-objekt associeres med Player-objekter.
    //----------------------------------------------------------------------------------------------------------
    public Player(String name){
        Account konto = new Account();
        this.name = name;
        this.konto = konto;
    }


    //-----------------------------------------------------------------
    // Lægger nye points til spillerens score, som ligger i hans konto
    //-----------------------------------------------------------------
    public int addScore(int point){
        int nyScore = konto.addScore(point);
        return nyScore;
    }

    //---------------------------
    // Getters og setters
    //---------------------------

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getScore(){
        return konto.getScore();
    }

    public void setScore(int score){
        konto.setScore(score);
    }
}
