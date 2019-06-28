package main.test.com.stackroute.exercise2;

import main.java.com.stackroute.exercise2.PowerOfFour;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {
    PowerOfFour pobj;
    @Before
    public void setUp() throws Exception
    {
        pobj=new PowerOfFour();
    }

    @After
    public void tearDown() throws Exception
    {
        pobj=null;
    }

    @Test
    public void checkWhetherNumberIsPowerOfFour()
    {
        String result = pobj.checkWhetherNumberIsPowerOfFour(16);
        assertEquals("a power of 4",result);
    }
    @Test
    public void checkWhetherNumberIsNotPowerOfFour()
    {
        String result = pobj.checkWhetherNumberIsPowerOfFour(15);
        assertEquals("not a power of 4",result);
    }

}