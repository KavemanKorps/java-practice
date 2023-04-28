public class Pets 
{
    private String name;
    private int age;
    private double weight;

    // START CONSTRUCTORS:
    // thid will set the name, age, and wright of the pet if we have that data available. 
    public Pets(String initialName, int initialAge, double initialWeight)
    {
        set(initialName, initialAge, initialWeight);
    }

    // this constructor is used only if we have the name of the pet
    public Pets(String initialNameString)
    {
        set(initialName, 0, 0);
    }

    // this const used only if we have the age of the pet.
    public Pets(int initialAge)
    {
        set("No name", initialAge, 0);
    }

    // this constructor used only if we have the pet's weight:
    public Pets(double initialWeight)
    {
        set("No name", 0, initialWeight);
    }

    // default constructor used if we don't have any data about the pet:

    public void set(String newName, int newage, double newWeight) throws Exception {
        System.out.println("Hello, World!");
    }
}
