import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int intArray[];   
        intArray = new int[3];

        int number;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter 3 floats:");
        for (int i = 0; i < 3; i++) {
            number = keyboard.nextInt();
            intArray[i] = number;
        }
        keyboard.close();

        System.out.println("\nPrinting your numbers now!:");
        for (int j = 0; j <= 3; j++) {
            System.out.println(intArray[j]);
        }
    }
}
