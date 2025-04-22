
/**
 * Write a description of interface Activity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Activity
{
    protected double distance;
    protected Athlete athlete;
    protected TransportationMode mode;
    
    
    public Activity(Athlete athlete, double distance, TransportationMode mode)
    {
        this.athlete = athlete;
        this.distance = distance;
        this.mode = mode;
    }
    
    public abstract double calculateCalories();

    public double getDistance()
    {
        return distance;
    }
    
    public Athlete getAthlete()
    {
        return athlete;
    }
    
    public TransportationMode getMode()
    {
        return mode;
    }
}
