//******************************************************************
//  Die.java        Author: Gruppe 17
//
//  Repræsenterer én terning med værdier svarende til 6 sider.
//******************************************************************

package spil;

import java.util.Random;

public class Die {
private int faceValue;
public int faceAmount;


    //---------------------------
    //Constructor for Die klassen
    //---------------------------
    public Die(int faceAmount){
        this.faceAmount = faceAmount;
    }




    //-----------------------------------
    //Ruller terning og returner resultatet
    //-----------------------------------
    public int rul() {
        Random r = new Random();
        this.faceValue = r.nextInt(this.faceAmount) + 1;
        return this.faceValue;
    }



    //-------------------
    //Getters og setters
    //-------------------
    public int getFaceValue(){
        return this.faceValue;
    }

}

//Rul - få et tal fra 1-6 (samt tilføj faceValue til spil.Player objekt)
//Getters og setters


//Ekstra!
//Sammenlign - Sammenlign to spil.Die-objekters face-value (hint: this.x == other.x)