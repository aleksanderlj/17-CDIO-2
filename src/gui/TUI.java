package gui;
// Jonatan 10:30 - 12:40. 11:45
import java.util.Scanner;

public class TUI {
    private static String[] languageArray;
    private static String name1, name2;
    private static int playerTurn, score1, score2;

    private static void startGame() {
        String startGame;
        startGame = "Velkommen til spillet Goldmine (Welcome to the game Goldmine).\n";
        System.out.println(startGame);

        String changeLanguage;
        changeLanguage = "Vælg venligst et sprog (Please choose a language).\n" +
                "For at vælge dansk så klik 1 og Enter. To choose english press 2 and Enter.";
        System.out.println(changeLanguage);
        languageArray = Language.choseLanguage();
        System.out.println(languageArray[0] + "\n");
    }

    private static void Names() {
        TUI.startGame();

        Scanner names = new Scanner(System.in);
        System.out.print(languageArray[2]);
        name1 = names.nextLine();
        System.out.print(languageArray[3]);
        name2 = names.nextLine();
    }
}