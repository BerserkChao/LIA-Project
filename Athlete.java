
//this is the athlete class
public class Athlete
{
    private String name;
    private int age;
    private Gender gender;
    
    //constructs an athlete with a name, an age and a gender
    public Athlete(String name, int age, Gender gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //athlete methods
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public Gender getGender()
    {
        return gender;
    }
}
