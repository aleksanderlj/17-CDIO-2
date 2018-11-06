//******************************************************************
//  Account.java        Author: Gruppe 17
//
//  Repræsenterer en spillers konto
//******************************************************************

package spil;

public class Account {
    private int score = 1000;

    //-------------------------
    // Lægger point til scoren
    //-------------------------
    public int addScore(int point){
        this.score =+ point;
        if (this.score < 0)
            this.score = 0;
        return this.score;
    }

    //--------------------
    // Getters og setters
    //--------------------
    public int getScore(){
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
