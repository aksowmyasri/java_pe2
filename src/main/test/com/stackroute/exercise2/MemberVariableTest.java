package main.test.com.stackroute.exercise2;

import main.java.com.stackroute.exercise2.MemberVariable;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {
    MemberVariable member;
    @Before
    public void setUp() throws Exception
    {
        member = new MemberVariable();
    }

    @After
    public void tearDown() throws Exception
    {
        member = null;
    }

    @Test
    public void printValues() {
        String result = member.printValues("Harry Potter",30,2500.3);
        assertEquals("Members Name:Harry Potter\n"+"Members Age:30\n"+"Members Salary:2500.3",result);
    }
}