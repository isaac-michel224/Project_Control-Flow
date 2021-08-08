import java.util.*;

public class Main {

    //below is our entry point
    //this is our main method which
    //the jvm will use to start our program
    public static void main(String[] args) {
        System.out.println("Hello world!");


        // print the valid characters for input
        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();


        //Input both first and last name - "Hello ___"
        Scanner input = new Scanner (System.in);
        System.out.println("Input your first name: ");
        String fname = input.next();
        System.out.print("Input your last name: ");
        String lname = input.next();
        System.out.println();
        System.out.println("Hello \n" +fname+" "+lname);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String someString = scanner.next();

       //https://www.infoworld.com/article/2077505/java-tip-139--ask-the-right-questions-in-your-survey-application.html
        //https://github.com/isaac-michel224/Project_Control-Flow/blob/main/Control%20Flow%20-%20PROJECT.md

    }






}
