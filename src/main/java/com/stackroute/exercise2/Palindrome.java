package main.java.com.stackroute.exercise2;

public class Palindrome {
    public static String checkForPalindrome(String input)
    {
        String result="";
        int length= input.length();
        for(int i=length-1;i>=0;i--)
            result=result+input.charAt(i);
        if(input.equals(result))
            return input+" is a palindrome";
        else
            return input+" is not a palindrome";
    }
}
