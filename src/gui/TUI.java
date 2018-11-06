package gui;
// Jonatan 10:30

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TUI {
    public static void main(String[] args){
        String[] languageArray;
        languageArray = new String[10];

        String startGame;
        startGame = "Velkommen til spillet Goldmine (Welcome to the game Goldmine).\n";
        System.out.println(startGame);

        String changeLanguage;
        changeLanguage = "Vælg venligst et sprog (Please choose a language).\n" +
                "For at vælge dansk så klik 1 og Enter. To choose english press 2 and Enter.";
        System.out.println(changeLanguage);


        Scanner input = new Scanner(System.in);
        int chosenLanguage;
        chosenLanguage = input.nextInt();

        if (chosenLanguage == 1){
            try {
                String file = "src/gui/DanskTekst.txt";
                BufferedReader reader = new BufferedReader(new FileReader(file));
                for (int i = 0;(i < 10);i++) {
                    String currentLine = reader.readLine();
                    languageArray[i] = currentLine;
                }
                reader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        else {
            try {
                String file = "src/gui/EngelskTekst.txt";
                BufferedReader reader = new BufferedReader(new FileReader(file));
                for (int i = 0;(i < 10);i++) {
                    String currentLine = reader.readLine();
                    languageArray[i] = currentLine;
                    System.out.println(languageArray[i]);
                }
                reader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }



    }
}
