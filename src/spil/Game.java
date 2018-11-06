package spil;

public class Game {
    public static final int WINSCORE = 3000;

    //*****************************************************************************************
    // Kører en enkelt tur for en enkel spiller. Hvis spilleren slå 10, får han en ekstra tur.
    //*****************************************************************************************
    public static void round(Player player, Die d1, Die d2){
        do {
            int rollSum = d1.rul() + d2.rul();
            int score = score(rollSum);
            player.addScore(score);
        } while(rollSum == 10);
    }

    //********************************************
    // Bestemmer scoren baseret på terningens rul
    //********************************************
    private static int score(int roll){
        int[] scoreTable = {0, 250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};
        return scoreTable[roll-1];
    }

    //******************************************************************************
    // Returnerer true hvis der er en potentiel vinder eller false hvis der ikke er
    //******************************************************************************
    public static boolean isWinner(Player p1, Player p2){
        return ((p1.getScore >= WINSCORE) || (p2.getScore >= WINSCORE));
    }

    public static String winner(Player p1, Player p2){
        String winner;

        if ((p1.getScore >= WINSCORE) && (p2.getScore >= WINSCORE))
            winner = "Begge";
        else if (p1.getScore >= WINSCORE)
            winner = p1.getName;
        else
            winner = p2.getName;

        return winner;
    }
}
