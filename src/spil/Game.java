//******************************************************************
//  Game.java        Author: Gruppe 17
//
//  Styrer spillets regler.
//******************************************************************

package spil;

public class Game {
    public static final int WINSCORE = 3000;
    private static int[] scoreTable = {0, 250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};

    //-----------------------------------------------------------------------------------------
    // Kører en enkelt tur for en enkel spiller. Hvis spilleren slå 10, får han en ekstra tur.
    //-----------------------------------------------------------------------------------------
    public static void round(Player player, Die d1, Die d2){
        int rollSum;
        do {
            rollSum = d1.rul() + d2.rul();
            int score = score(rollSum);
            player.addScore(score);
        } while(rollSum == 10);
    }

    //--------------------------------------------
    // Bestemmer scoren baseret på terningens rul
    //--------------------------------------------
    private static int score(int roll){
        return scoreTable[roll-1];
    }

    //------------------------------------------------------------------------------
    // Returnerer true hvis der er en potentiel vinder eller false hvis der ikke er
    //------------------------------------------------------------------------------
    public static boolean isWinner(Player p1, Player p2){
        return ((p1.getScore() >= WINSCORE) || (p2.getScore() >= WINSCORE));
    }

    //-------------------------------------------
    // Printer navnet på vinderen hvis der er en
    //-------------------------------------------
    public static String winner(Player p1, Player p2){
        String winner;

        if ((p1.getScore() >= WINSCORE) && (p2.getScore() >= WINSCORE))
            winner = "Begge";
        else if (p1.getScore() >= WINSCORE)
            winner = p1.getName();
        else if (p2.getScore() >= WINSCORE)
            winner = p2.getName();
        else
            winner = "Ingen";

        return winner;
    }
}
