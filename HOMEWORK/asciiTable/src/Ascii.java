import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) throws Exception 
    {
        int count;

        System.out.println("This program will print out all the ascii characters 33-126");
        System.out.println("using three different types of loops.");
        System.out.println();

        // with a for loop:
        System.out.println("This is a countdown using a for loop.");
        for (int i = 33; i <= 126; i++)
        {
            System.out.println(i + " = " + (char)i);
        }

        // with a while loop:
        count = 33;
        while (count <= 126)
        {
            System.out.println(count + " = " + (char)count);
            count++;
        }

        // with a do-while loop:
        count = 33;
        do
        {
            System.out.println(count + " = " + (char)count); 
            count++;
        } while (count <= 126);
    }
}
