import java.io.IOException;
import java.net.*;
import java.rmi.Naming;
import java.rmi.server.RemoteServer;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
/**
 * Write a description of class StatusServer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StatusServer
{
    
    public static void main(String [] args) throws Exception {
       try{
            IRobotStatus robotStatus = new RobotStatus();
            String objName = "rmi://localhost/IRobotStatus";
            
            LocateRegistry.createRegistry(1099);
            RemoteServer.setLog( System.err ); 
            Naming.rebind(objName, robotStatus);
            
            System.out.println("listening for clients...");
        }
        catch(Exception e){
            System.out.println("Something went wrong on RMIServer");
        }
    }
    
    
}
