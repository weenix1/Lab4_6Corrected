import java.util.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
/**
 * Write a description of class Jobcompleted here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JobCompleted  
{
    private JobCompleted jobCompleted;
    private int condition = 1;
    private int currentJob;
    
    /**
     * Constructor for objects of class Jobcompleted
     */
    public JobCompleted()
    {
        this.condition = condition;
        this.jobCompleted = jobCompleted;
        this.currentJob = currentJob;
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
     
     //@Override
     public void update(Object JobCompleted){
       this.setJobCompleted((String) JobCompleted);
      
    }
    
      public void setJobCompleted(String JobCompleted) {
        this.jobCompleted = jobCompleted;
        
    }
    
    public boolean saveJobCompleted(){
        
        if(currentJob == condition){
           System.out.println("Job saved");
           return true;
           
       } else{
            System.out.println("try again later...");
        return false;
         
        }
        
      
    }
    
}
