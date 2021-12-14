import java.util.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
/**
 * Write a description of class Battery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battery  
{
    private Battery battery;
    private int batteryLevel;
    private int duration;
    
    /**
     * Constructor for objects of class Battery
     */
    public Battery()//int batteryLevel,int duration)
    {
        this.batteryLevel = 100;
        this.duration  -= 20;
        this.battery = battery;
    }
    
    public int getState()
    {
        return batteryLevel;
    }
    
    public int getDuration(){
       System.out.println();
       return duration; 
    }

    
    public boolean getBatteryLevel(){
       Battery bt = battery;
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
    
    //@Override
    public void setBattery(Object Battery){
        this.battery = battery;
    }
    
    
    public void duration()
    {
        this.duration = 100;
     }
     
    private void update(Object battery){
       this.setBattery((int) battery);
      
    }
}
