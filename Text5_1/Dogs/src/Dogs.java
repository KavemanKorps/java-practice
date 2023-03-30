public class Dogs 
{
    public String name;
    public String breed;
    public int age;

    // outputs the values of the Daogs class for a given dog.
    // "void" funcs have no return value
    public void writeOutput()
    {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age in calender years: " + age);
        System.out.println("Age in humans years: " + ageInHumanYears());

    }

    // "int" funcs return an integer. Not returning an int makes the func name underline red. 
    // method calculates the dog's equivalent age in human years. 
    public int ageInHumanYears()
    {
        int humanAge;

        if (age <= 2)
            humanAge = age * 11;
        else
            humanAge = 22 + ((age - 2) * 5);
        return humanAge;
    }


}
