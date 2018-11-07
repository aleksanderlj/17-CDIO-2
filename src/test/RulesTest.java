package test;

import org.junit.jupiter.api.Test;
import spil.Account;
import spil.Die;
import spil.Player;

import static org.junit.jupiter.api.Assertions.*;

public class RulesTest {

    //Tester at spillerens konto kan komme under 0

    @Test
    void minimum(){
        spil.Account testKonto = new Account();
        for (int i = 0; i < 30; i++) {
            testKonto.addScore(GameStub.scoreStub());
        }
        assertTrue(testKonto.getScore()==0);
    }

    //Tester at en spiller vinder ved 3000 points

    @Test
    void vinde(){

    }

    //Tester at spilleren får en ekstra tur når der bliver slået 10

}
