import java.util.Scanner;

public class Stoplight 
{
    public static void main(String[] args)
    {
        char light, police;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("This program will simulate the conditions you find at a stop light.");
        System.out.println("What color is the stop light (R, Y, G)?:");
        light = keyboard.next().charAt(0);

        if (light == 'Y' || light == 'y')
        {
            System.out.println("Are there any police cars in sight (Y, N)?:");
            police = keyboard.next().charAt(0);

            if (police == 'Y' || police == 'y')
                System.out.println("Stop, unless you want a ticket!");
            else if (police == 'N' || police == 'n')
                System.out.println("Floor it, if you dare!");
            else 
                System.out.println("Invalid input.");
        }   // end yellow light

        else if (light == 'G' || light == 'g')
            System.out.println("Drive normally");
        else if (light == 'R' || light == 'r')
            System.out.println("Stop, the light is red!");
        else 
            System.out.println("Invalid input, bozo.");
            
        keyboard.close();
    }   // end main
}   // end class
