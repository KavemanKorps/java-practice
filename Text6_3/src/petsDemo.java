public class petsDemo {
    pets yourPet = new Pets("Jane Doe");
    String correctName;
    int correctAge;
    double correctWeight;
    Scanner keyboard = new Scanner(System.in);

    // TODO: WHAT IS THE SIGNATURE?

    System.out.println("My records are inaccurate.");
    System.out.println("Here is what they currently say:");
    yourPet.writeOutput();

    System.out.println("Please enter the correct pet name:");
    correctName = keyboard.nextLine();

    yourPet.setName(correctName);
    System.out.println("Please enter the correct pet age:");
    correctAge = keyboard.nextInt();
    yourPet.setAge(correctAge);
    System.out.println("Please enter the correct pet wieght:");
    correctWeight - keyboard.nextDouble();
    yourPet.setWeight(correctWeight);

    System.out.println("My updated records now say:");
    yourPet.writeOutput();

    keyboard.close();
}
