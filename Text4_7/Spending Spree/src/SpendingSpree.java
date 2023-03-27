public class SpendingSpree {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        while (haveMoney && ((itemNumber <= MAX_ITEMS)))
        {
            System.out.println("You may buy up to " + MAX_ITEMS - itemNumber + 1 + " items.");
            System.out.println("costing no more than $" + leftToSpend + ".");
            System.out.print("Etner the cost of item number #" + itemNumber + ": ");

            int itemCost = keyboard.nextInt();
            if (itemCost <= leftToSpend)
            {
                System.out.println("You spent $" + totalSpent + " so far.");
                leftToSpend = SPENDING_MONEY - totalSpent;
    
                if (leftToSpend > 0)
                    itemNumber++;
                else
                {
                    System.out.println("You are out of money.");
                    haveMoney = false;
                }
            }
        }
    }
}
