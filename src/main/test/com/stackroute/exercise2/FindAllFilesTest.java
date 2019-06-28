package main.test.com.stackroute.exercise2;
import main.java.com.stackroute.exercise2.FindAllFiles;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
public class FindAllFilesTest {

    FindAllFiles findAllFiles;
    String expectedResult;
    String actualResult;

    @Before
    public void setUp() throws Exception {
        findAllFiles = new FindAllFiles();
    }

    @Test
    public void checkWhetherFileContentIsCorrect() throws IOException {
        actualResult = findAllFiles.findAndReadFiles(new String[] {"src/", "file"});
        expectedResult = "Calculates the frequency of the words in a given file";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkWhetherFileIsPresent() throws IOException {
        actualResult = findAllFiles.findAndReadFiles(new String[] {"", "file"});
        expectedResult = "Exception";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown()throws Exception {
        findAllFiles = null;
    }
}