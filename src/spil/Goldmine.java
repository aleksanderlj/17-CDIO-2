package spil;

import gui.*;

public class Goldmine {
    public static void main(String[] args){
        boolean correctDieValue;
        String namePlayer1, namePlayer2;

        // Choose language
        TUI.startGame();
        TUI.language();
        TUI.printLanguage();

        // Choose dice
        do {
            TUI.printChooseDice();

            int dieFaceAmount1 = TUI.getDieFace(0);
            int dieFaceAmount2 = TUI.getDieFace(1);
            int dieFaceSum = dieFaceAmount1 + dieFaceAmount2;
            correctDieValue = (((dieFaceSum <= 12) && (dieFaceSum >= 2)) &&
                              ((dieFaceAmount1 < 12) && (dieFaceAmount1 > 0)) &&
                              ((dieFaceAmount2 < 12) && (dieFaceAmount2 > 0)));

            Game.createDiePair(dieFaceAmount1, dieFaceAmount2);
        } while (!correctDieValue);

        // Choose name
        TUI.chooseNames();
        namePlayer1 = TUI.getName(0);
        namePlayer2 = TUI.getName(1);

        Game.createPlayerPair(namePlayer1, namePlayer2);


        // Play game
        /*
        do {

        } while (!Game.isWinner());
        */

        // Win + end game
    }
}
