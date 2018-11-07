package spil;

import gui.*;

public class Goldmine {
    public static void main(String[] args){
        // Choose language
        TUI.startGame();
        TUI.language();
        TUI.printLanguage();

        // Choose dice
        boolean correctDieValue;
        do {
            TUI.printChooseDice();

            int dieFace1 = TUI.getDieFace(0);
            int dieFace2 = TUI.getDieFace(1);
            int dieFaceSum = dieFace1 + dieFace2;
            correctDieValue = (((dieFaceSum <= 12) && (dieFaceSum >= 2)) &&
                              ((dieFace1 < 12) && (dieFace1 > 0)) &&
                              ((dieFace2 < 12) && (dieFace2 > 0)));

            Game.createDiePair(dieFace1, dieFace2);
        } while (!correctDieValue);

        // Choose name
        TUI.chooseNames();

        Game.createPlayer(TUI.getName(0));
        Game.createPlayer(TUI.getName(1));


        // Play game
        /*
        do {

        } while (!Game.isWinner());
        */

        // Win + end game
    }
}
