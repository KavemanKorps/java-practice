import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int weekday;
        
        System.out.println("Enter a number 1-5:");
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            weekday = keyboard.nextInt();
            switch (weekday) {
                case 1:
                    System.out.println("Today is Monday");
                    break;
                case 2:
                    System.out.println("Today is Tuesday");
                    break;
                case 3:
                    System.out.println("Today is Wedsnday");
                    break;
                case 4:
                    System.out.println("Today is Thursday");
                    break;
                case 5:
                    System.out.println("Today is Friday");
                    break;
                default:
                    System.out.println("Invalid input");
                    keyboard.close();
                    System.exit(0);
            }
        }
    }
}
