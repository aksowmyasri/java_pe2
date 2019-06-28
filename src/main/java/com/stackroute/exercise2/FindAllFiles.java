package main.java.com.stackroute.exercise2;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
//Program to find all files in a given directory
public class FindAllFiles {
    public static String findAndReadFiles(String[] names) throws IOException {
        try {
            File directory = new File(names[0]);

            File[] filesList = directory.listFiles();



            File file = new File(names[0] + "/" + names[1]);
            FileInputStream fileInputStream = new FileInputStream(file);

            byte[] fileContent = new byte[(int) file.length()];
            fileInputStream.read(fileContent);
            String content = new String(fileContent);
            return content;
        }
        catch (Exception exception) {
            return "Exception";
        }
    }
}
