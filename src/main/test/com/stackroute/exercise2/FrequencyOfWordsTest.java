package main.test.com.stackroute.exercise2;

import static org.junit.Assert.*;

import main.java.com.stackroute.exercise2.FrequencyOfWords;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
public class FrequencyOfWordsTest {
    FrequencyOfWords frequencyOfWords;
    String expectedResult;
    String actualResult;

    @Before
    public void setUp() throws Exception {
        frequencyOfWords = new FrequencyOfWords();
    }

    @Test
    public void checkWhetherTheFrequencyOfWordsIsCorrect() {
        try {
            actualResult = frequencyOfWords.frequencyOfWords("file");
        } catch (IOException e) {
            e.printStackTrace();
        }
        expectedResult = "Calculates-1the-2frequency-1of-1the-2words-1in-1a-1given-1file-1";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkWhetherTheFileIsCorrect() {
        try {
            actualResult = frequencyOfWords.frequencyOfWords("abc");
        } catch (IOException e) {
            e.printStackTrace();
        }
        expectedResult = "Exception";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        frequencyOfWords = null;
    }

}