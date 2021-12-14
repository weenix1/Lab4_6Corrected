import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * Write a description of interface Observer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Observer extends Remote
{
    /** 
     * This method is called whenever the observed object is changed. An 
     * application calls an {@code Observable} object's 
     * {@code notifyObservers} method to have all the object's 
     * observers notified of the change. 
     * 
     * @param   o     the observable object. 
     * @param   arg   an argument passed to the {@code notifyObservers} 
     *                 method. 
     */ 
    public void update(IObservable o,Object arg) throws RemoteException; 
}
