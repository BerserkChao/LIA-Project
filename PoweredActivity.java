//this class is useless, I added it to have a subclass for activites, but I'm not sure how to put it to use.
/**
 * Write a description of class PoweredActivity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class PoweredActivity extends Activity
{
    private Equipment equipment;
    public PoweredActivity(Athlete athlete, double distance, TransportationMode mode, Equipment equipment)
    {
        super(athlete, distance, mode);
        this.equipment = equipment;
    }
}
