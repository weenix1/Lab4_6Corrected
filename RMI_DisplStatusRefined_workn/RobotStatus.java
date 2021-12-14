import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.List;
import java.util.ArrayList;
/**
 * Abstract class RobotStatus - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */

 public class RobotStatus extends UnicastRemoteObject implements IRobotStatus
{
    private JobCompleted completes;
    private Location loc;
    private int battery;
    private String JobCompleted;
    private String status;
    private int condition = 1;
    private int currentJob;
    private int batteryLevel;
    private int duration;
     Observable  observable;   
    public RobotStatus() throws RemoteException{
        this.battery = battery;
        this.loc = loc;
        status = "standby";
        //Battery bt = new Battery();
        this.JobCompleted = JobCompleted;
        JobCompleted jb = new JobCompleted();
        observable = new Observable();
       }
    
    public String startCleaning() throws RemoteException
    {
         if(battery > 20.0)
         {
            this.status = "cleaning";
            this.battery -= 20;
         }
        else
         {
            this.status = "charging";
            gotoChargeDock();
         }
        String response = "robot status = " + this.status + "\n" + "battery: " + this.battery + "%";
        
        return response;
     }
      
    public String findBatteryLevel() throws RemoteException
    {
        this.status = "BatteryLevel";
        getBatteryLevel();
        String response = "Battery status = " + this.status;
        return response;
    }
        
    public String findLocation() throws RemoteException
    {
        this.status = "CurrentLocation";
        getLocation();
        String response = "Location status = " + this.status;
        return response;
     }
   
    public String findJobCompleted() throws RemoteException
    {
        this.status = "JobCompleted";
        getJobCompleted();
        String response = "robot Job status = " + this.status;
        return response;
     }
    
    public String gotoChargeDock() throws RemoteException
    {
        this.status = "Charging";
        gotoChargeDock();
        String response = "robot status = " + this.status;
        return response;
    }
    
    public void getLocation() 
    {
         Location loc1 = new Location("LivingRoom",+ 40.366633, 74.640832);
        Location loc2 = new Location("Bedroom",  +  42.443087, 76.488707);  
        double distance = loc1.distanceTo(loc2);
        System.out.printf("%6.3f miles from", + distance);
        System.out.println(loc1 + " to " + loc2);
    }
    
    public boolean getJobCompleted()
    { 
        
        if(currentJob == condition){
           System.out.println("New Job completed");
           return true;
           
        } else{
            System.out.println("No completed job record available...");
        return false;
         
        }
        
    }
    
    public boolean getBatteryLevel(){
       //Battery bt = battery;
       if((batteryLevel + duration) < 100){
           this.duration -=20;
           System.out.println("batteryLevel: " + this.batteryLevel + "%");
          return true;
        }else{
            System.out.println("Battery needs to be charged");
            return false;
        }
      //System.out.println("Battery needs to be charged");
    }
    
    protected void notifyAllObservers() throws RemoteException
    {
        observable.notifyAllObservers(this);
        
    }
    
    @Override
    public void addObserver(Observer observer){
        observable.addObserver(observer);
        
    }
    
    @Override
    public void removeObserver(Observer observer){
        observable.removeObserver(observer);
    }
}
