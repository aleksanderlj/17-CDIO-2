//******************************************************************
//  DieTest.java        Author: Gruppe 17
//
//  Dokument til JUnit test af terningespil
//******************************************************************

package test;

import org.junit.jupiter.api.Test;
import spil.Die;
import static org.junit.jupiter.api.Assertions.*;


class DieTest {

    Die d1 = new Die(6);
    Die d2 = new Die(6);

    //------------------------------------------------------
    // Tester om terningen rammer alle værdier fra 1 til 6.
    //------------------------------------------------------
    @Test
    void Kast() {
        final int EXPECTEDFACE = 6;
        int actualFace = 0;
        int face1 = 0, face2 = 0, face3 = 0, face4 = 0, face5 = 0, face6 = 0;

        for(int i = 0;(i<=60000); i++){
            int roll = d1.rul();


            assertTrue(roll>0 && roll<7);

            if (roll==1 && face1==0) {
                face1++;
                actualFace++;
            }
            if (roll==2 && face2==0) {
                face2++;
                actualFace++;
            }
            if (roll==3 && face3==0) {
                face3++;
                actualFace++;
            }
            if (roll==4 && face4==0) {
                face4++;
                actualFace++;
            }
            if (roll==5 && face5==0) {
                face5++;
                actualFace++;
            }
            if (roll==6 && face6==0) {
                face6++;
                actualFace++;
            }
        }
        assertEquals(EXPECTEDFACE, actualFace);
    }

    //-----------------------------------------------------------------
    // Tester om terningen rammer alle sider omtrent lige mange gange.
    //-----------------------------------------------------------------
    @Test
    void En_Terning() {
        int a2=0, a3=0, a4=0, a5=0, a6=0, a1=0;

        while(a1 + a2 + a3 + a4 + a5 + a6 <= 60000) {

            d1.rul();
            int roll = d1.getFaceValue();

            if (roll == 1) {
                a1++;
            }
            if (roll == 2) {
                a2++;
            }
            if (roll == 3) {
                a3++;
            }
            if (roll == 4) {
                a4++;
            }
            if (roll == 5) {
                a5++;
            }
            if (roll == 6) {
                a6++;
            }
        }
        System.out.println("");
        System.out.println("En terning er blevet slået 60000 gange:");
        System.out.println("Antal 1'ere " + a1);
        System.out.println("Antal 2'ere " + a2);
        System.out.println("Antal 3'ere " + a3);
        System.out.println("Antal 4'ere " + a4);
        System.out.println("Antal 5'ere " + a5);
        System.out.println("Antal 6'ere " + a6);
        assertTrue(a1 <= 10400 && a1  >= 9600
                && a2 <= 10400 && a2  >= 9600
                && a3 <= 10400 && a4  >= 9600
                && a4 <= 10400 && a4  >= 9600
                && a5 <= 10400 && a5  >= 9600
                && a6 <= 10400 && a6  >= 9600);
    }

    //----------------------------------------------------------------
    // Tester om summen af kastet af to terninger er korrekt fordelt.
    //----------------------------------------------------------------
    @Test
    void To_Ternninger() {
        int a2=0, a3=0, a4=0, a5=0, a6=0, a7=0, a8=0, a9=0, a10=0, a11=0, a12 =0;
        final int ANTALTEST = 110000;

        while(a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12<= ANTALTEST) {

            d1.rul();
            d2.rul();
            int roll = d1.getFaceValue() + d2.getFaceValue();

            if (roll == 2) {
                a2++;
            }
            if (roll == 3) {
                a3++;
            }
            if (roll == 4) {
                a4++;
            }
            if (roll == 5) {
                a5++;
            }
            if (roll == 6) {
                a6++;
            }
            if (roll == 7) {
                a7++;
            }
            if (roll == 8) {
                a8++;
            }
            if (roll == 9) {
                a9++;
            }
            if (roll == 10) {
                a10++;
            }
            if (roll == 11) {
                a11++;
            }
            if (roll == 12) {
                a12++;
            }
        }
        System.out.println("");
        System.out.println("De to terninger blev kastet " + ANTALTEST + " gange.");

        System.out.println("Antal 2'ere slået er " + a2);
        System.out.println("Antal 3'ere slået er " + a3);
        System.out.println("Antal 4'ere slået er " + a4);
        System.out.println("Antal 5'ere slået er " + a5);
        System.out.println("Antal 6'ere slået er " + a6);
        System.out.println("Antal 7'ere slået er " + a7);
        System.out.println("Antal 8'ere slået er " + a8);
        System.out.println("Antal 9'ere slået er " + a9);
        System.out.println("Antal 10'ere slået er " + a10);
        System.out.println("Antal 11'ere slået er " + a11);
        System.out.println("Antal 12'ere slået er " + a12);

        assertTrue(a2 <= ANTALTEST * (1.0/36) * 1.05 && a2 >= ANTALTEST * (1.0/36) * 0.95);
        assertTrue(a3 <= ANTALTEST * (2.0/36) * 1.05 && a3 >= ANTALTEST * (2.0/36) * 0.95);
        assertTrue(a4 <= ANTALTEST * (3.0/36) * 1.05 && a4 >= ANTALTEST * (3.0/36) * 0.95);
        assertTrue(a5 <= ANTALTEST * (4.0/36) * 1.05 && a5 >= ANTALTEST * (4.0/36) * 0.95);
        assertTrue(a6 <= ANTALTEST * (5.0/36) * 1.05 && a6 >= ANTALTEST * (5.0/36) * 0.95);
        assertTrue(a7 <= ANTALTEST * (6.0/36) * 1.05 && a7 >= ANTALTEST * (6.0/36) * 0.95);
        assertTrue(a8 <= ANTALTEST * (5.0/36) * 1.05 && a8 >= ANTALTEST * (5.0/36) * 0.95);
        assertTrue(a9 <= ANTALTEST * (4.0/36) * 1.05 && a9 >= ANTALTEST * (4.0/36) * 0.95);
        assertTrue(a10 <= ANTALTEST * (3.0/36) * 1.05 && a10 >= ANTALTEST * (3.0/36) * 0.95);
        assertTrue(a11 <= ANTALTEST * (2.0/36) * 1.05 && a11 >= ANTALTEST * (2.0/36) * 0.95);
        assertTrue(a12 <= ANTALTEST * (1.0/36) * 1.05 && a12 >= ANTALTEST * (1.0/36) * 0.95);
    }

    //-----------------------------------------------------------------------------
    // Tester om antallet af gange to terninger slår ens værdi er korrekt fordelt.
    //-----------------------------------------------------------------------------
    @Test
    void Ens_Slag() {
        int ens = 0;
        final int ANTALTEST = 110000;

        int a=0;
        while (a <= ANTALTEST) {
            d1.rul();
            d2.rul();

            if (d1.getFaceValue() == d2.getFaceValue()) {
                ens++;
            }
            a++;
        }
        System.out.println("");
        System.out.println("Antal gange der blev slået ens øjne ud af " + ANTALTEST + " er: " + ens);
        assertTrue(ens <= ANTALTEST * (1.0/6) * 1.04 && ens >= ANTALTEST * (1.0/6) * 0.96);
    }
}