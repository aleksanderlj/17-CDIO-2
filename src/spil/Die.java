//******************************************************************
//  Die.java        Author: Gruppe 17
//
//  Repræsenterer én terning med værdier svarende til 6 sider.
//******************************************************************

package spil;

import java.util.Random;

public class Die {
private int faceValue;

    //---------------
    //Ruller terning
    //---------------
    public void rul() {
        Random r = new Random();
        this.faceValue = r.nextInt(6) + 1;
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