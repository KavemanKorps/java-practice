// TO MAKE JAVA PROGRAMS, WE FIRST HAVE TO CREATE A "PROJECT". Within that peoject, we create a class and name it. 
import java.util.Scanner;

public class ScannerDemo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter two whole numbers");
        System.out.println("Seperated by one or more spaces:");
        int num1, num2;
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        System.out.println("You entered " + num1 + " and " + num2);

        System.out.println("Next, enter two numbers");
        System.out.println("A decimal point is OK (Oll Korrect; 19th century origin):");
        double d1, d2;
        d1 = keyboard.nextDouble(); // will read the next number with a decimal place
        d2 = keyboard.nextDouble();
        System.out.println("You entered " + d1 + " and " + d2);

        System.out.println("Next, enter two words:");
        String str1, str2;
        str1 = keyboard.next();
        str2 = keyboard.next();

        System.out.println("You entered \"" + str1 + "\" and \"" + str2 + "\"");

        
        // im fucking bored of this shit
    } // end main
}   // end class