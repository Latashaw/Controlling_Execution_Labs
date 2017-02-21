package latasha.Controlling_Execution_Labs;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by latashawatson on 2/16/17.
 */
public class SumOrProductCalculatorTest {
    SumOrProductCalculator sOPC;

    @Before
    public void setup() {
        sOPC = new SumOrProductCalculator();
    }

    @Test
    public void sum() {
    assertEquals(15,sOPC.sum(5));
    }

    @Test
    public void product() {
    assertEquals(120, sOPC.product(5));
    }

    @Test
    public void sumChoiceTest() {
        assertEquals(15, sOPC.choice("sum",5));
    }

    @Test
    public void productChoiceTest() {
        assertEquals(120, sOPC.choice("product",5));
    }
}