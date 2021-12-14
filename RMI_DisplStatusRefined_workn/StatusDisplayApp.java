import java.rmi.*;
import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;
// import java.rmi.RMISecurityManager;
/**
 * Write a description of class StatusDisplayClient here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
   public class StatusDisplayApp extends UnicastRemoteObject implements Observer
   { 
     private IRobotStatus robot;  
     public StatusDisplayApp() throws Exception
    { 
      IRobotStatus server = (IRobotStatus)
              Naming.lookup("rmi://127.0.0.1/IRobotStatus");
      IRobotStatus robot = server;
      System.out.println("Client side RobotStatus:" + robot);
    }
    
    public void update(IObservable o,Object arg) throws RemoteException{
        System.out.println(((RobotStatus)arg).findLocation());
        System.out.println(((RobotStatus)arg).findJobCompleted());
        System.out.println(((RobotStatus)arg).findBatteryLevel());
    }
    
    
}
