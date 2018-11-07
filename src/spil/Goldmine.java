package spil;

import gui.*;

public class Goldmine {
    public static void main(String[] args){
        // Choose language
        TUI.startGame();
        TUI.language();
        TUI.printLanguage();

        // Choose dice
        do {
            TUI.printChooseDice();
            int dieFace1 = TUI.getDieFace(0);
            int dieFace2 = TUI.getDieFace(1)
            Game.createDiePair(dieFace1, dieFace2);
        } while ()

        // Choose name
        TUI.chooseNames();

        // Play game

        // Win + end game
    }
}
