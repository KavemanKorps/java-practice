import java.util.Scanner;

public class Circle {
    public static final double PI = 3.14159;
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double radius;
        double area;

        System.out.println("Enter the radius of a circle in inches:");
        radius = keyboard.nextDouble();
        area = PI * radius * radius;
    }
}

