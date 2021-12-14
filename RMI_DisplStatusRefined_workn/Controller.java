import java.util.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Observer;
/**
 * Abstract class Controller - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public  class Controller  {
    Scanner scanner;
    Location Loc;
    JobCompleted jobCompleted;
    Battery bt;
    public Controller()
    {
        jobCompleted = new JobCompleted();
        bt = new Battery();
    }
    
    public void getJobCompleted()
    {
        jobCompleted.getJobCompleted();
    }
    
    public void getBatteryLevel()
    {
        bt.getBatteryLevel();
    }
    
    public void getLocation(){
        Location loc1 = new Location("LivingRoom",+ 40.366633, 74.640832);
        Location loc2 = new Location("Bedroom",  +  42.443087, 76.488707);  
        double distance = loc1.distanceTo(loc2);
        System.out.printf("%6.3f miles from", + distance);
        System.out.println(loc1 + " to " + loc2);
    }
    
    /*public static void main(String[] args) throws RemoteException {
        scanner = new Scanner(System.in);
        //System.out.printf("Update of the Robot status:", +'\n');
        System.out.printf("JobCompleted:", +'\n');
        JobCompleted jb = new JobCompleted();
        System.out.println();
        jb.getJobCompleted();
        
        System.out.printf('\n'+"BatteryStatus:", +'\n');
        Battery bt = new Battery();
        System.out.println();
        bt.batteryLevel();
        //bt.update();
        
        System.out.printf('\n'+"CurrentLocation:" + "\n");
        Location loc1 = new Location("LivingRoom",+ 40.366633, 74.640832);
        Location loc2 = new Location("Bedroom",  +  42.443087, 76.488707);  
        double distance = loc1.distanceTo(loc2);
        System.out.printf("%6.3f miles from", + distance);
        System.out.println(loc1 + " to " + loc2);
        
        
        
        
        RobotStatus robotStatus = new RobotStatus();
        System.out.println();
        robotStatus.update();
        
        
     }*/
 
    
    
}
