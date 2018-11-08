//******************************************************************
//  Language.java        Author: Gruppe 17
//
//  Styrer hvilke sprog bliver valgt
//******************************************************************

package gui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Language {
    private static String currentLine;
    private static String[] languageArray;

    //--------------------------------------------------------
    // Læser den rigtige sprog fil, og deler den op i et array
    //--------------------------------------------------------
    public static String[] chooseLanguage(int a) {
        languageArray = new String[22];

        if (a == 1) {
            try {
                String file = "src/gui/DanskTekst.txt";
                BufferedReader reader = new BufferedReader(new FileReader(file));
                for (int i = 0; (i < 22); i++) {
                    currentLine = reader.readLine();
                    languageArray[i] = currentLine;
                }
                reader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            try {
                String file = "src/gui/EngelskTekst.txt";
                BufferedReader reader = new BufferedReader(new FileReader(file));
                for (int i = 0; (i < 22); i++) {
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
