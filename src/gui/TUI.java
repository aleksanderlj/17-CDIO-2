package gui;
// Jonatan 10:30 - 12:40
import java.util.Scanner;

public class TUI {
    private static String[] languageArray;

    public static void startGame() {
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

    public static void main(String[] args) {
        TUI.startGame();
        /*
        String name1,name2;
        Scanner input2 = new Scanner(System.in);

        System.out.print(languageArray[2]);
        name1 = input2.nextLine();
        System.out.println();

        System.out.println(languageArray[3]);
        name2 = input2.nextLine();

        System.out.println(name1);
        System.out.println(name2);
        */
    }
}
