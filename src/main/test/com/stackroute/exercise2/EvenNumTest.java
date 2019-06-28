package main.test.com.stackroute.exercise2;

import main.java.com.stackroute.exercise2.EvenNum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTest {
    EvenNum e;
    @Before
    public void setUp() throws Exception
    {
        e= new EvenNum();
    }

    @After
    public void tearDown() throws Exception
    {
        e=null;
    }

    @Test
    public void testNumberIsEven()
    {
        boolean b = e.isEven(4);
        assertEquals(true,b);
    }
    @Test
    public void testNumberIsOdd()
    {
        boolean b = e.isEven(5);
        assertEquals(false,b);
    }
}