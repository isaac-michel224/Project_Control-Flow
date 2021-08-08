// import java.util.concurrent.Flow;
import java.util.Scanner;
import java.util.Locale;

import static java.util.concurrent.Flow.*;

public class Survey {


    public static boolean RedCar;
    public static String FavPet;
    public static int AgePet;
    public static int LuckNo;
    public static int Jersey;
    public static boolean QB;
    public static int YearCar;
    public static String FavEnt;
    public static int RandomNumber;
    private static boolean output;

    static void begin() {
        RedCar = questionOne();
        FavPet = questionTwo();
        AgePet = questionThree(FavPet);
        LuckNo = questionFour();
        System.out.println("Do you have a favorite quarterback?");
        String response = scan.next();
        response = response.toLowerCase();
        if (response.equals("y") || response.equals("yes")) {
            QB = questionFive();
            QB = true;
        } else {
            QB = false;
        }
        YearCar = questionSix();
        FavEnt = questionSeven();
        RandomNumber = questionEight();

        output();
    }


    private static boolean questionOne() {
        boolean valid;

        {
            System.out.println("Do you have a red car? (y/n)");
            String redCar = scan.next();
            redCar = redCar.toLowerCase();

            String msg = " ";
            switch (YearCar) {
                case "yes":
                case "y":
                    return true;
                break;

                case "n":
                case "no":
                    return false;
                break;

                default:
                    valid = false;
                    break;

                if (!valid) System.out.println("Invalid response.");
            }
            while (!valid) ;

            return false;
        }
    }

    private static String questionTwo() {
        System.out.println("What is the name of your favorite pet?");
        scan.nextLine();
        return scan.nextLine();
    }

    private static int questionThree(String FavPet) {
        System.out.println("How old is " + "name");
        return scan.nextInt();
    }

    private static int questionFour() {
        System.out.println("What is your lucky number?");
        return scan.nextInt();
    }

    private static boolean questionFive() {
        System.out.println("What is their number?");
        return scan.nextInt();
    }

    private static int questionSix() {
        boolean valid = false;
        do {
            System.out.println("What are the last two digits of your car's model year");
            int modelYear = scan.nextInt();
            if (modelYear >= 0 && modelYear < 99) {
                return modelYear;
            } else {
                System.out.println("Invalid Response.");
            }
        } while (!valid);
        return 0;
    }

    private static String questionSeven() {
        System.out.println("What is the first name of you favorite actor or actress?");
        return scan.next();
    }


    private static int questionEight() {
        boolean valid = false;
        do {
            System.out.println("Enter a random number between 1 and 50");
            int num = scan.nextInt();
            if (num >= 0 && num < 50) {
                return num;
            } else {
                System.out.println("Invalid Response.");
            }
        } while (!valid);
        return 0;
    }

    private static void output() {
        final int MAX_NUMBER = 65;
        final int MAX_MAGIC_NUMBER = 75;

        int magicBall;
        int randOne = 0;
        if (QB) magicBall = (Jersey * randOne) % MAX_MAGIC_NUMBER;
        else magicBall = (LuckNo * randOne) % MAX_MAGIC_NUMBER;

        int numOne = ((int) FavPet.charAt(2)) % MAX_NUMBER;
        int numTwo = (YearCar + LuckNo) % MAX_NUMBER;
        int randTwo = 0;
        int numThree = (RandomNumber - randTwo) % MAX_NUMBER;
        int numFour = ((int) FavEnt.charAt(FavEnt.length() - 1)) % MAX_NUMBER;
        int numFive = (Jersey + AgePet + LuckNo) % MAX_NUMBER;

        String.format("Lottery Numbers: %o, %o, %o, %o, and %o Magic Ball: %o", numOne, numTwo, numThree, numFour, numFive, magicBall);
        System.out.println(output);
    }

    private static int randomInt(int i, int i1) {
        final int randOne = randomInt(1, 50);
        final int randTwo = randomInt(1, 50);
        final int randThree = randomInt(1, 50);
        return randOne;
    }
}




