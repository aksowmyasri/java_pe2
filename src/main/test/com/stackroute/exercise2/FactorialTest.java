package main.test.com.stackroute.exercise2;

import main.java.com.stackroute.exercise2.Factorial;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    Factorial factorial;
    @Before
    public void setUp() throws Exception
    {
        factorial= new Factorial();
    }

    @After
    public void tearDown() throws Exception
    {
        factorial = null;
    }
    @Test
    public void givenInputNumberReturnFactorialTillThatNumber() {
        String actualStr = factorial.getFactorial(2);
        String expectedStr = "The factorial of 1 is 1\n" + "The factorial of 2 is 2";
        assertEquals(expectedStr,actualStr);
    }

    @Test
    public void givenInputNumberReturnFactorial() {
        String actualStr = factorial.getFactorial(4);
        String expectedStr = "The factorial of 1 is 1\n" + "The factorial of 2 is 2\n" + "The factorial of 3 is 6\n" + "The factorial of 4 is 24";
        assertEquals(actualStr,expectedStr);
    }

}