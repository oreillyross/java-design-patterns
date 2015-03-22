/**
 * 
 */
package observer;

/**
 * <h1> Objects use this interface to register as observers </h1> 
 * This interface lists the methods that subjects like the database system should implement
 * The Subject objects has to let observers register and has to notify  them when an event occurs.
 */
public interface Subject {
	
  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObservers();
  
}
  
