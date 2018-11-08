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

    //------------------------
    // Laver et par terninger
    //------------------------
    public static void createDiePair(int face1, int face2){
        die[0] = new Die(face1);
        die[1] = new Die(face2);
    }

    /*
    //------------------------------
    // Laver en spiller med et navn
    //------------------------------
    public static void createPlayer(String name){
        player[playerIndex] = new Player(name);
        playerIndex++;
    }
    */

    //-----------------------
    // Laver et par spillere
    //-----------------------
    public static void createPlayerPair(String name1, String name2){
        player[0] = new Player(name1);
        player[1] = new Player(name2);
    }

    //-----------------------------------------------------------------------------------------
    // Kører en enkelt tur for en enkel spiller. Hvis spilleren slå 10, får han en ekstra tur.
    //-----------------------------------------------------------------------------------------
    public static void round(int playerIndex){
        rollSum = die[0].rul() + die[1].rul();
        int score = score(rollSum);
        player[playerIndex].addScore(score);
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
    public static boolean isWinner(){
        return ((player[0].getScore() >= WINSCORE) || (player[1].getScore() >= WINSCORE));
    }

    //------------------------------------------------------------------------------------------------
    // Printer 1 hvis Spiller 1 har vundet, 2 hvis Spiller 2 har vundet og 3 hvis de begge har vundet
    //------------------------------------------------------------------------------------------------
    public static int winner(){
        int winner = 0;

        if (player[0].getScore() >= WINSCORE)
            winner += 1;
        if (player[1].getScore() >= WINSCORE)
            winner += 2;

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