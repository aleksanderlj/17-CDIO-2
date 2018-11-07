package gui;
// Jonatan 10:30 - 12:40. 11:45
import spil.Player;

import java.util.Scanner;

public class TUI {
    private static String[] languageArray, nameArray;
    private static String name1, name2;

    private static void startGame() {
        String startGame;
        startGame = "Velkommen til spillet Goldmine (Welcome to the game Goldmine).\n";
        System.out.println(startGame);

        String changeLanguage;
        changeLanguage = "Vælg venligst et sprog (Please choose a language).\n" +
                "For at vælge dansk så klik 1 og Enter. To choose english press 2 and Enter.";
        System.out.println(changeLanguage);
    }

    public static int language(){
        Scanner input1 = new Scanner(System.in);
        int chosenLanguage;
        chosenLanguage = input1.nextInt();

        languageArray = Language.chooseLanguage(chosenLanguage);
        //System.out.println(languageArray[0] + "\n");

        return (chosenLanguage);
    }

    public static void printLanguage(){
        System.out.println(languageArray[0]);
    }

    public static void chooseNames() {
        languageArray = Language.getLanguage();

        Scanner names = new Scanner(System.in);
        System.out.print(languageArray[2]);
        name1 = names.nextLine();
        System.out.print(languageArray[3]);
        name2 = names.nextLine();
        nameArray = new String[] {name1,name2};
    }

    public static String[] getNames(){
        return (nameArray);
    }

    public static void printPlayersTurn(Player player){
        System.out.println(player.getName() + "'s" + languageArray[4]);
    }

    public static void printPlayerScore(int score){
        System.out.println(languageArray[5] + score);
    }

    public static void printWin1(Player player){
        System.out.println(player.getName() + languageArray[6]);
    }

    public static void printWin2(){
        System.out.println(languageArray[7]);
    }
}