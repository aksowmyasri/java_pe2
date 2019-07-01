package main.test.com.stackroute.exercise2;

import main.java.com.stackroute.exercise2.EvenNumberChecker;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberCheckerTest {
    EvenNumberChecker evenNumberChecker;
    @Before
    public void setUp() throws Exception
    {
        evenNumberChecker= new EvenNumberChecker();
    }

    @After
    public void tearDown() throws Exception
    {
        evenNumberChecker=null;
    }

    @Test
    public void givenInputNumberReturnTrue()
    {
        boolean b = evenNumberChecker.isEven(4);
        assertEquals(true,b);
    }
    @Test
    public void givenInputNUmberREturnFalse()
    {
        boolean b = evenNumberChecker.isEven(5);
        assertEquals(false,b);
    }
}