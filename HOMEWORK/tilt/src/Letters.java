import java.util.Scanner;

public class Letters {
    private String input;
    private int line, count;
    private char letter;

    // prompts the user to enter a combination of the letters T, I, and L.
    public void readInput() 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter four letters that consist of any combination of T, I, and L:");
        input = keyboard.next().toUpperCase();
        System.out.println("You entered the following: " + input);
        keyboard.close();
    }

    // this method will print out the appropriate line for each of the letters:
    public void printOut()
    {
        for (line = 0; line < 5; line++) 
        {
            for (count = 0; count < 4; count++) 
            {
                letter = input.charAt(count);

                if (letter == 'T') 
                    printT();
                else if (letter == 'I')
                    printI();
                else if (letter == 'L')
                    printL();
                else if (letter == 'S')
                    printS();
                else 
                {
                    System.out.println("\nInput input detected, terminating program");
                    System.exit(0);
                }

                System.out.print(' ');
            }
            System.out.println();
        }
    }

    // prints out a given line for the letter T:
    private void printT()
    {
        if (line == 0)
            System.out.print("-----");
        else 
            System.out.print("  |  "); 
    }

    // for letter I
    private void printI()
    {
        if (line == 0 || line == 4)
            System.out.print("-----");
        else
            System.out.print("  |  "); 
    }

    // for letter L
    private void printL()
    {
        if (line == 4)
            System.out.print("-----");
        else 
            System.out.print("|    "); 
    }

    // for letter S
    private void printS()
    {
        if (line == 0 || line == 2 || line == 4 )
            System.out.print("-----");
        else if (line == 1) 
            System.out.print("|    ");
        else 
            System.out.print("    |");
    }
}
