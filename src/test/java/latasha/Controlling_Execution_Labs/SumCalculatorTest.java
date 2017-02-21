package latasha.Controlling_Execution_Labs;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by latashawatson on 2/16/17.
 */
public class SumCalculatorTest {
    int input = 5;
    SumCalculator c;

        @Before
    public void setUp(){
        c = new SumCalculator();
    }

    @Test
    public void sumTest(){
        assertEquals(15, c.sum(input));
    }

}