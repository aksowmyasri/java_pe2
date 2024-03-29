package main.test.com.stackroute.exercise2;

import main.java.com.stackroute.exercise2.ReadFile;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class ReadFileTest {
    ReadFile f;
    @Before
    public void setUp() throws Exception
    {
        f = new ReadFile();
    }

    @After
    public void tearDown() throws Exception
    {
        f = null;
    }

    @Test
    public void givenInputFileNameReturnContentInpperCase()
    {
        String str = f.checkReadFile(new File("testout"));
        assertEquals("THIS IS A PROGRAM TO READ A FILE.",str);
    }
    @Test
    public void givenInputWrongFileReturnNotFound()
    {
        String str = f.checkReadFile(new File("out"));
        assertEquals("NOT FOUND",str);
    }
}