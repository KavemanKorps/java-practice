package Text3_1;

public class BankBalance {
    public static final double OVERDRAWN_PENALTY = 8.00;
    public static final double INTEREST_RATE = 0.02;

    public static void main(String[] args)
    {
        // what are scanner objects again?
        Scanner keyboard = new Scanner(System.in);
        double balance;

        System.out.println("Enter your checking account balance:");
        // what is nextDouble?
        balance = keyboard.nextDouble();

        // CURLY BRACKETS ONLY NEEDED WHEN THERE ARE MULTIPLE LINES IN THE IF
        if (balance >= 0)
            balance = balance + (INTEREST_RATE * balance / 12);
        else
            balance = balance -  OVERDRAWN_PENALTY;

        System.out.println("After adjusting for one month");
        System.out.println("of interest and/or penalties");
        System.out.println("your new balance is $" + balance);

        if (balance >= 0)
        {
            System.out.println("Good for you, you earned interest.");
            balance = balance + (INTEREST_RATE * balance / 12);
        }
        else
        {
            System.out.println("You will be charged a penalty.");
            balance = balance - OVERDRAWN_PENALTY;
        }
    }
    // TODO: END KEYBOARD THINGY HERE
    keyboard.close();
}
