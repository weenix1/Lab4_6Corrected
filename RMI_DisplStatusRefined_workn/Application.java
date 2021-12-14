import java.util.*;

public class Application
{
    
    public static void main() throws Exception
    {
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        System.out.println("To you wish to view the robot status? type 'yes' or 'no'");
        String answer = scanner.next();
        
        Controller controller = new Controller();
        
        if(answer.equals("yes"))
        {
            
            while(answer.equals("yes"))
            {   
                
                System.out.println("\nType your action: 'viewCurrentLocation', 'ViewBatteryLevel', 'ViewJobCompleted','close'");
                String choice = scanner.next();
                if(choice.equals("viewCurrentLocation"))
                {
                    controller.getLocation();
                } 
                else if(choice.equals("ViewBatteryLevel"))
                {
                    controller.getBatteryLevel();
                }
                else if(choice.equals("ViewJobCompleted"))
                {
                    controller.getJobCompleted();
                }
                else if(choice.equals("close"))
                {
                    answer = "no";
                }
                else
                {
                    System.out.println("Please type a valid input..");
                }
            }
        }
        
        
        System.out.println("\nHave a nice day!");
    }
}