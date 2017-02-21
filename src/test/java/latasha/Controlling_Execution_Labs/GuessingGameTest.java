package latasha.Controlling_Execution_Labs;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by latashawatson on 2/16/17.
 */
public class GuessingGameTest {
    GuessingGame g;


    @Before
    public void setUp(){
        g=new GuessingGame();
    }


    @Test
    public void guess() {
        assertEquals(1, g.guess(6, 6));
    }

}