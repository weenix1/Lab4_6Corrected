import java.util.Vector;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;


/**
 * Write a description of class Observable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
  public class Observable implements IObservable {
    //private RobotStatus status;
    private ArrayList<Observer> observerList = new ArrayList<>();
    //no constructor because no need to create instances
    public Observable() throws RemoteException {
        super();
        //status = new RobotStatus();
    }

    //methods for observer design pattern
    /**
     * add an observer to the list of observers
     * @param observer to add it to observer list
     */
    public void addObserver(Observer observer){
        observerList.add(observer);
        
    }

    /**
     * remove an observer from the list of observers
     * @param observer to delete it to observer list
     */
    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }
    
    
   protected void notifyAllObservers(RobotStatus status) throws RemoteException {
        for (Observer observer : observerList) {
            try {
                observer.update(this,status);
            } catch (RemoteException e) {
                // Could not update observer, ignore
            }
            //System.out.println("test");
        }
    }
}
