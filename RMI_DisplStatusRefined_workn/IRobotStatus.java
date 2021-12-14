import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * Write a description of interface IRobotStatus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface IRobotStatus extends IObservable, Remote
{
   String findBatteryLevel() throws RemoteException;
   String findLocation() throws RemoteException;
   String findJobCompleted() throws RemoteException;
}
