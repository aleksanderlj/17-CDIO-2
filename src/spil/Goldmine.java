package spil;

import gui.*;

public class Goldmine {
    public static void main(String[] args){
        boolean correctDieValue;
        String namePlayer1, namePlayer2;
        int winner;

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

        do {

            do {
                TUI.printPlayersTurn(0);
                Game.round(0);
                TUI.printFaceValue();
                TUI.printEndTurn(Game.getRollSum());
                TUI.printPlayerScore(0);
            } while(Game.getRollSum() == 10);

            do {
                TUI.printPlayersTurn(1);
                Game.round(1);
                TUI.printFaceValue();
                TUI.printEndTurn(Game.getRollSum());
                TUI.printPlayerScore(1);
            } while(Game.getRollSum() == 10);

        } while (!Game.isWinner());

        // Win + end game

        winner = Game.winner();

        if (winner == 3){
            TUI.printWin2();
        }
        else{
            TUI.printWin1(winner - 1);
        }


    }
}
