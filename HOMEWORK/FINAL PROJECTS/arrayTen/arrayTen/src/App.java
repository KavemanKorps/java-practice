import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float floatArr[];   
        floatArr = new float[10];

        int number;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter 10 floats:");
        for (int i = 0; i < floatArr.length; i++) {
            number = keyboard.nextInt();
            floatArr[i] = number;
        }
        keyboard.close();

        System.out.println("\nPrinting your floats now!:");
        for (int j = 0; j <= floatArr.length - 1; j++) {
            System.out.println(floatArr[j]);
        }
    }
}
