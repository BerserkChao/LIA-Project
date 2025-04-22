
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
