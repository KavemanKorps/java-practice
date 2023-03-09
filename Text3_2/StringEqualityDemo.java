// each of these folders requires a class to be defined.

package Text3_2;

public class StringEqualityDemo {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String s1, s2;

        System.out.println("Please enter two lines of text:");
        s1 = keyboard.nextLine();
        s2 = keyboard.nextLine();

        if (s1.equals(s2))
            System.out.println("The two lines are equal");
        else
            System.out.println("The two lines are not equal");
        
        if (s2.equals(s1))
            System.out.println("The two lines are equal");
        else
            System.out.println("The two lines are not equal");"The two lines are not equal");
        
        if (s1.equalsIgnoreCase(s2))
            System.out.println("But the lines are equal, ignoring the case");
        else (s2.equalsIgnoreCase(s1))
            System.out.println("But the lines are equal, ignoring the case");

    }
}
