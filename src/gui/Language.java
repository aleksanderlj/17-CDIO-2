package gui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Language {
    private static String currentLine;
    private static String[] languageArray;

    // Denne metode finder ud af hvilket sprog, resten af det grafiske skal være på, og finder de rigtige linjer.

    public static String[] choseLanguage(){
        languageArray = new String[20];

        Scanner input1 = new Scanner(System.in);
        int chosenLanguage;
        chosenLanguage = input1.nextInt();
        //input1.close();

        if (chosenLanguage == 1){
            try {
                String file = "src/gui/DanskTekst.txt";
                BufferedReader reader = new BufferedReader(new FileReader(file));
                for (int i = 0;(i < 20);i++) {
                    currentLine = reader.readLine();
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
                }
                reader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return (languageArray);
    }
}
