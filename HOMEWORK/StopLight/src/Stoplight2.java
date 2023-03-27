import java.util.Scanner;

public class Stoplight2
{
    public static void main(String[] args)
    {
        char light, police;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("This program will simulate the conditions you find at a stop light.");
        System.out.println("What color is the stop light (R, Y, G)?:");
        light = keyboard.next().charAt(0);;

        switch (light) 
        {
            case 'Y':
            case 'y':
                System.out.println("Are there any police cars in sight (Y, N)?:");
                police = keyboard.next().charAt(0);

                if (police == 'Y' || police == 'y')
                    System.out.println("Stop, unless you want a ticket!");
                else if (police == 'N' || police == 'n')
                    System.out.println("Floor it, if you dare!");
                else 
                    System.out.println("Invalid input.");
                // end yellow light
                break;
            case 'G':
            case 'g':
                System.out.println("Drive normally");
                break;
            case 'R':
            case 'r':
                System.out.println("Stop, the light is red!");
                break;
            default:
                System.out.println("Invalid input");
        }                      
        keyboard.close();
    }   // end main
}   // end class
