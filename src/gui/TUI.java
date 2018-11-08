package gui;
// Jonatan 10:30 - 12:40. 11:45 - 15:
import spil.Game;
import spil.Player;

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
    // Tager input, til at vælge sprog
    //--------------------------------
    public static int language(){
        Scanner input1 = new Scanner(System.in);
        int chosenLanguage;
        chosenLanguage = input1.nextInt();

        languageArray = Language.chooseLanguage(chosenLanguage);
        return (chosenLanguage);
    }

    //-------------------------
    // Spillere vælger navne
    //-------------------------
    public static void chooseNames() {
        Scanner names = new Scanner(System.in);
        System.out.print(languageArray[3]);
        String name1 = names.nextLine();
        System.out.print(languageArray[4]);
        String name2 = names.nextLine();
        nameArray = new String[] {name1,name2};
    }

    //-------------------------
    // Printere til UI
    //-------------------------
    public static void printLanguage(){
        System.out.println(languageArray[0]);
    }

    public static void printChooseDice(){
        Scanner input = new Scanner(System.in);
        System.out.print(languageArray[1]);
        int die1 = input.nextInt();
        int die2 = input.nextInt();
        System.out.println(languageArray[2] + die1 + " " + die2);
        dieArray = new int[] {die1, die2};
    }

    public static void printPlayersTurn(int player){
        System.out.println(Game.getPlayerName(player) + "'s" + languageArray[5]);
    }

    public static void printFaceValue(){
        System.out.println(languageArray[6] + Game.getDieFaceValue(0) + " + " + Game.getDieFaceValue(1) + " = " + Game.getRollSum());
    }

    public static void printPlayerScore(int player){
        System.out.println(languageArray[7] + Game.getPlayerScore(player));
    }

    public static void printWin1(int player){
        System.out.println(Game.getPlayerName(player) + languageArray[8]);
    }

    public static void printWin2(){
        System.out.println(languageArray[9]);
    }

    public static void printEndTurn(int input){
        if ((input >= 11) && (input <= 21)) {
            System.out.println(languageArray[input]);
        }
        else{
            System.out.println("FEJL");
        }
    }

    //-------------------------
    // Gettter
    //-------------------------
    public static String getName(int nameIndex) {
        return nameArray[nameIndex];
    }

    public static int getDieFace(int dieIndex){
        return dieArray[dieIndex];
    }
}