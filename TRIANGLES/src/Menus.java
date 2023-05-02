import java.util.Scanner;

// class with the menu that prompts the user to enter a value for the num. of stars in the triangle.
public class Menus {
    DrawTriangles triangle = new DrawTriangles();

    // this method prompts user to enter a value for the triangle's size:
    public void prompt() 
    {
        int input;
        Scanner keyboard = new Scanner(System.in);

        do
        {
            System.out.println("This program will print out right triangles in different configurations");
            System.out.println("Please enter an int value between 3 and 9, or 0 to quit");
            input = keyboard.nextInt();

            if ((input >= 3 && input <= 9))
            {
                triangle.drawTriangle1(input);
                triangle.drawTriangle2(input);
                triangle.drawTriangle3(input);
                triangle.drawTriangle4(input);  
            }

            else if (input != 0)
            {
                System.out.println("Invalid input, please try again.");
            }

        } while (input != 0);

        System.out.println("Exiting program");
        keyboard.close();
    }
}
