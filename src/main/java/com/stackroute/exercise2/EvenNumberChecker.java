package main.java.com.stackroute.exercise2;
//Program to check whether the number is even or odd
public class EvenNumberChecker {
    public static boolean isEven(int number) {
        boolean result;
        if (number % 2 == 0)
            result=true;
        else
            result=false;
        return result;
    }
}
