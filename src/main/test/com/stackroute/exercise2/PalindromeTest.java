package main.test.com.stackroute.exercise2;

import main.java.com.stackroute.exercise2.Palindrome;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome;
    @Before
    public void setUp()
    {
        palindrome=new Palindrome();
    }
    @After
    public void tearDown()
    {
        palindrome=null;
    }
    @Test
    public void givenInputStringReturnPalindrome() {
        String result=palindrome.checkForPalindrome("madam");
        assertEquals("madam is a palindrome",result);
    }
    @Test
    public void givenInputNumberReturnPalindrome() {
        String result=palindrome.checkForPalindrome("1234321");
        assertEquals("1234321 is a palindrome",result);
    }
    @Test
    public void givenInputStringReturnNotPalindrome() {
        String result=palindrome.checkForPalindrome("mada");
        assertEquals("mada is not a palindrome",result);
    }

}