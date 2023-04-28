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
    public Pets()
    {
        set("No name", 0, 0);
    }
    // end constructors

    // start SET methods
    public void setPet(String newName, int newAge, double newWeight)
    {
        set(newName, newAge, newWeight);
    }

    public void setName(String newName)
    {
        set(newName, age, weight);
    }

    public void setAge(int newAge)
    {
        set(name, newAge, weight);
    }

    public void setWeight(double newWeight)
    {
        set(name, age, newWeight);
    }

    // this method sets the values for different variables based on whatever data is avaipable. 
    public void set(String newName, int newAge, double newWeight)
    {
        name = newName;

        if (newAge < 0 || newWeight < 0)
        {
            System.out.println("ERROR: Negative age and/or weight.");
            System.out.println("Exiting program...");
            System.exit(0);
        }
        else
        {
            age = newAge;
            weight = newWeight;

        }
    }
    // start get methods:
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public double getWeight()
    {
        return weight;
    }

    // this method will output data about a given pet:
    public void writeOutput()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    } // end writeOutput()
}
