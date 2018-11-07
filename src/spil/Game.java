//******************************************************************
//  Game.java        Author: Gruppe 17
//
//  Styrer spillets regler.
//******************************************************************

package spil;

public class Game {
    public static final int WINSCORE = 3000;
    private static int[] scoreTable = {0, 250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};
    private static int rollSum;
    private static Die[] die = new Die[2];
    private static int dieIndex = 0;
    private static Player[] player = new Player[2];
    private static int playerIndex = 0;

    /*
    //----------------------------------------------------------------------
    // Laver en terning og sørger for at øjenene ikke er over 11 og under 1
    //----------------------------------------------------------------------
    public static void createDie(int face){
        if ((face < 12) && (face > 0)){
            die[dieIndex] = new Die(face);
            dieIndex++;
        }
    }
    */

    /*
    //------------------------------------------------------
    // Laver et par terninger som tilsammen har 12 ansigter
    //------------------------------------------------------
    public static void createDiePair12(int face){
        createDie(face);
        createDie(12 - face);
    }
    */

    //--------------------------------------------------------------------------------------------------
    // Laver et par terninger og sørger for, at de samlede ansigter ikke overstiger 12 eller er under 2
    //--------------------------------------------------------------------------------------------------
    public static void createDiePair(int face1, int face2){
        int faceSum = face1 + face2;
        boolean correctDieValue = (((faceSum <= 12) && (faceSum >= 2)) &&
                                  ((face1 < 12) && (face1 > 0)) &&
                                  ((face2 < 12) && (face2 > 0))); //Det her skal måske stå i main
        if (correctDieValue){
            die[0] = new Die(face1);
            die[1] = new Die(face2);
        }
    }

    //------------------------------
    // Laver en spiller med et navn
    //------------------------------
    public static void createPlayer(String name){
        player[playerIndex] = new Player(name);
        playerIndex++;
    }

    //-----------------------------------------------------------------------------------------
    // Kører en enkelt tur for en enkel spiller. Hvis spilleren slå 10, får han en ekstra tur.
    //-----------------------------------------------------------------------------------------
    public static void round(Player player, Die d1, Die d2){
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

    //--------------------
    // Getters og setters
    //--------------------
    public static int getDieFaceValue(int dieIndex){
        return die[dieIndex].getFaceValue();
    }

    public static int getRollSum(){
        return rollSum;
    }

    public static String getPlayerName(int playerIndex){
        return player[playerIndex].getName();
    }

    public static int getPlayerScore(int playerIndex){
        return player[playerIndex].getScore();
    }
}