package main.java.com.stackroute.exercise2;

public class Factorial {
    public String getFactorial(int number )
    {
        int factorial;
        String replaceString;
        String factorialString;
        factorialString="";
        replaceString="";

        //This loop will compute the factorial
        for( int i=1;i<=number ; i++ )
        {
            factorial =1;
            for( int j=1 ; j<=i ;j++ )
            {
                factorial= factorial*j;
            }
            replaceString=replaceString+"The factorial of "+i+" is "+Integer.toString(factorial)+ "\n";
        }
        for(int i=0;i<replaceString.length()-1 ; i++ )
        {
            factorialString=factorialString+replaceString.charAt(i);
        }
        return factorialString;
    }

}