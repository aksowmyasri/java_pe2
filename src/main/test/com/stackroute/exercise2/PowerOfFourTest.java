package main.test.com.stackroute.exercise2;

import main.java.com.stackroute.exercise2.PowerOfFour;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {
    PowerOfFour powerOfFour;
    @Before
    public void setUp() throws Exception
    {
        powerOfFour=new PowerOfFour();
    }

    @After
    public void tearDown() throws Exception
    {
        powerOfFour=null;
    }

    @Test
    public void givenInputNumberReturnPowerOfFour()
    {
        String result = powerOfFour.checkWhetherNumberIsPowerOfFour(16);
        assertEquals("a power of 4",result);
    }
    @Test
    public void givenInputNumberReturnNotPowerOfFour()
    {
        String result = powerOfFour.checkWhetherNumberIsPowerOfFour(15);
        assertEquals("not a power of 4",result);
    }

}