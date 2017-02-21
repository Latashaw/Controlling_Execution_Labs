package latasha.Controlling_Execution_Labs;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by latashawatson on 2/16/17.
 */
public class GreeterTest {
    String input1 = "alice";
    String input2 = "filbert";
    Greeter g;

    @Before
    public void setup() {
        g = new Greeter();
    }

    @Test
    public void greetTest(){
        assertEquals("hi alice!", g.greet(input1));
    }

    @Test
    public void greetTest2(){
        assertEquals("", g.greet(input2));
    }
}