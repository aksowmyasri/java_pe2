package main.java.com.stackroute.exercise2;
//Program to check whether the integer is power of four
public class PowerOfFour {
    public String checkWhetherNumberIsPowerOfFour(int input) {
        if (input == 1)
            return "not a power of 4";
        while (input != 1) {
            if (input % 4 != 0)
                return "not a power of 4";
            else
                input = input / 4;

        }
        return "a power of 4";
    }
}
