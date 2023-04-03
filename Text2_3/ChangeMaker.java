import java.util.Scanner;

public class ChangeMaker 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int amount, originalAmount, quarters, dimes, nickels, pennies;
        System.out.println("Enter a whole number between 1 and 99");
        System.out.println("I will find a combination of coins");
        System.out.println("that equals that amount of change:");
        amount = keyboard.nextInt();

        originalAmount = amount;
        quarters = amount / 25;
        amount = amount % 25;
        dimes = amount / 10;
        amount = amount % 10;
        nickels = amount / 5;
        amount = amount % 5;
        pennies = amount;

        System.out.println(originalAmount + " cents in coins can be given as");
        System.out.println(quarters);
        // print all the other currencies too bla bla bla lol this is very boring

        keyboard.close();
    }
}