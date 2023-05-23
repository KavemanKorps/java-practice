import java.util.Scanner;

public class Messages 
{
    private String message;
    private int code;

    Scanner keyboard = new Scanner(System.in);

    // prompt user to enter string
    public void setMessage()
    {
        System.out.println("Please enter message to encrypt:");
        message = keyboard.nextLine();
    }

    public void getMessage() 
    {
        System.out.println("The message you entered is as follows: " + message);
        System.out.println();
    }

    public void setCode() 
    {
        System.out.println("Please enter the code to encrypt your message with: ");
        code = keyboard.nextInt();
    }

    public void getCode() 
    {
        System.out.println("The code you entered is: " + code);
        System.out.println();
    }

    // converts the passed character into its encrypted version:
    private char encrypt(char letter) 
    {
        if (letter == ' ')
            return letter;
        else 
            /* what we do here? we turn the letter into "the char equivalent of the integer of letter + code" */ 
            letter = (char)((int)letter + code);

        return letter;
    }

    private void encryptAll()
    {
        // turns "message" string into char array:
        char[] messageArray = message.toCharArray();
        // array for encrypted message. Set to same length as "message"
        char[] encryptedArray = new char[message.length()];

        for (int index = 0; index < message.length(); index++)
        {
            // todo: the individual passing of letters here:
            // encryptedArray[index] = encrypt(/*what you needa pass to encrypt*/);
            encryptedArray[index] = encrypt(messageArray[index]);
            // System.out.print(/* same exact thing goes in these parentheses too (print encrypted version) */);
            System.out.println(encryptedArray[index]);
        }
    }

    public void printOut()
    {
        System.out.println("Here is the encrypted message:");
        encryptAll();
    }
}
