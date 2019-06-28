package main.test.com.stackroute.exercise2;

import main.java.com.stackroute.exercise2.Palindrome;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome pobj;
    @Before
    public void setUp()
    {
        pobj=new Palindrome();
    }
    @After
    public void tearDown()
    {
        pobj=null;
    }
    @Test
    public void checkForStringPalindrome() {
        String result=pobj.checkForPalindrome("madam");
        assertEquals("madam is a palindrome",result);
    }
    @Test
    public void checkForNumberPalindrome() {
        String result=pobj.checkForPalindrome("1234321");
        assertEquals("1234321 is a palindrome",result);
    }
    @Test
    public void checkForNotPalindrome() {
        String result=pobj.checkForPalindrome("mada");
        assertEquals("mada is not a palindrome",result);
    }

}