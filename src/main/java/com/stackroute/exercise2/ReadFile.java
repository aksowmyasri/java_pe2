package main.java.com.stackroute.exercise2;
//Program to read fles and convert the content to upper case
import java.io.*;

public class ReadFile {
    public static String checkReadFile(File file) {
        String line="";
        String rev="";
        int len=0;
        try {
            FileReader fr = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fr);
            while((line = bufferedReader.readLine())!=null)
            {
                rev=rev.concat(line);

            }
            len=rev.length();
            bufferedReader.close();
        } catch (IOException e) {
            rev="";
            rev="not found";
        }
        return rev.toUpperCase();
    }

}
