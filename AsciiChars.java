import java.util.Scanner;

public class AsciiChars {
    public static void printNumbers()
    {

        for (int i = 0; i <= 10 ; i++)
            System.out.println("the value of i is: " + i);
        //TODO: print valid numeric input
    }

    public static void printLowerCase()
    {
        //TODO: print valid lowercase alphabetic input

        for(char c = 'a'; c <= 'z'; c++) {
            System.out.println(c);
        }

    }

    public static void printUpperCase()
    {

        for(char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c);
        }
        //TODO: print valid upper case alphabetic input
    }


}

