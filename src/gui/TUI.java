//******************************************************************
//  TUI.java        Author: Gruppe 17
//
//  Styrer input fra spiller og interface
//******************************************************************

package gui;
// Jonatan 10:30 - 12:40. 11:45 - 15:
import spil.Game;
import spil.Player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TUI {
    private static String[] languageArray, nameArray;
    private static int[] dieArray;

    //--------------------------------------
    // Printer den første tekst i programmet
    //--------------------------------------
    public static void startGame() {
        String startGame;
        startGame = "Velkommen til spillet Goldmine (Welcome to the game Goldmine).\n";
        System.out.println(startGame);

        String changeLanguage;
        changeLanguage = "Vælg venligst et sprog (Please choose a language).\n" +
                "For at vælge dansk så klik 1 og Enter. To choose english press 2 and Enter.";
        System.out.println(changeLanguage);
    }

    //--------------------------------
    // Tager input til at vælge sprog
    //--------------------------------
    public static int language(){
        int chosenLanguage;

        do {
            try {
                Scanner input1 = new Scanner(System.in);
                chosenLanguage = input1.nextInt();
            }
            catch (InputMismatchException e){
                chosenLanguage = 0;
            }
        } while ((chosenLanguage != 1) && (chosenLanguage != 2));

        languageArray = Language.chooseLanguage(chosenLanguage);
        return (chosenLanguage);
    }

    //-------------------------
    // Spillere vælger navne
    //-------------------------
    public static void chooseNames() {
        Scanner names = new Scanner(System.in);
        System.out.println(languageArray[3]);
        String name1 = names.nextLine();
        System.out.println(languageArray[4]);
        String name2 = names.nextLine();
        nameArray = new String[] {name1,name2};
    }

    //----------------------------------------------
    // Fortæller spiller hvilket sprog de har valgt
    //----------------------------------------------
    public static void printLanguage(){
        System.out.println(languageArray[0]);
    }

    //---------------------------------------
    // Får værdier til skabelse af terninger
    //---------------------------------------
    public static void printChooseDice(){
        boolean areNumbers;

        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println(languageArray[1]);
                int die1 = input.nextInt();
                int die2 = input.nextInt();
                System.out.println(languageArray[2] + " " + die1 + " & " + die2);
                dieArray = new int[]{die1, die2};
                areNumbers = true;
            }
            catch (InputMismatchException e){
                areNumbers = false;
            }
        } while (!areNumbers);
    }

    //---------------
    // Spiller tur
    //---------------
    public static void printPlayersTurn(int player){
        Scanner input = new Scanner(System.in);
        System.out.println(Game.getPlayerName(player) + "'s" + languageArray[5]);
        input.nextLine();
    }

    //-----------------------------
    // Fortæller hvad spiller slog
    //-----------------------------
    public static void printFaceValue(){
        System.out.println(languageArray[6] + " " + Game.getDieFaceValue(0) + " + " + Game.getDieFaceValue(1) + " = " + Game.getRollSum());
    }

    //--------------------------------
    // Fortæller spillerens nye score
    //--------------------------------
    public static void printPlayerScore(int player){
        System.out.println(languageArray[7] + " " + Game.getPlayerScore(player));
    }

    //-------------------------------------------
    // Fortæller spilleren at han/hun har vundet
    //-------------------------------------------
    public static void printWin1(int player){
        System.out.println(Game.getPlayerName(player) + languageArray[8]);
    }

    //---------------------------------------------
    // Fortæller spillere hvis de begge har vundet
    //---------------------------------------------
    public static void printWin2(){
        System.out.println(languageArray[9]);
    }

    //---------------------------------------------------------------
    // Bruger flavor-text til at forklare spillerens ændring i score
    //---------------------------------------------------------------
    public static void printEndTurn(int input){
        int line = input + 9;
        if ((line >= 11) && (line <= 21)) {
            System.out.println(languageArray[line]);
        }
        else{
            System.out.println("FEJL");
        }
    }

    //----------
    // Gettters
    //----------
    public static String getName(int nameIndex) {
        return nameArray[nameIndex];
    }

    public static int getDieFace(int dieIndex){
        return dieArray[dieIndex];
    }
}