import java.util.List;
/**
 * Write a description of class ActivUtil here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ActivUtil
{
    //Listing activities by athlete, long names..
    public static void listActivitiesByAthlete(Athlete athlete, List<Activity> activities)
    {
        for(Activity a : activities){
            if(a.getAthlete().equals(athlete)){
                System.out.println(a); 
            }
        }
    }
    //total distance by activity - not sure if this works
    public static double calcTotalDistance(List <Activity> activities)
    {
        double total = 0;
        for(Activity a : activities){
            total += a.getDistance();
        }
        return total;
    }
    
   // public static double calcTotalCaloriesByAthlete(Athlete athlete,List<Activity> activities)
   // {
    //    double total = 0;
        //uhhh
}
