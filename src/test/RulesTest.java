package test;

import org.junit.jupiter.api.Test;
import spil.Account;
import spil.Die;
import spil.Player;

import static org.junit.jupiter.api.Assertions.*;

public class RulesTest {
    spil.Account testKonto = new Account();
    spil.Player testSpiller1 = new Player("1");
    spil.Player testSpiller2 = new Player("2");


    //Tester at spillerens konto kan komme under 0
    @Test
    void minimum(){
        for (int i = 0; i < 30; i++) {
            testKonto.addScore(GameStub.minusscoreStub());
        }
        assertTrue(testKonto.getScore()==0);
    }

    //Tester at en spiller vinder ved 3000 points
    @Test
    void vinde(){
        testSpiller1.addScore(GameStub.plusscoreStub());

    }

    //Tester at spilleren får en ekstra tur når der bliver slået 10

}
