import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Write a description of class IObservable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface IObservable extends Remote
{
    void addObserver(Observer o) throws RemoteException;
    void removeObserver(Observer o) throws RemoteException;
}
