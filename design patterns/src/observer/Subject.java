/**
 * 
 */
package observer;

/**
 * @author Ross
 * 
 * This interface lists the methods that subjects like the database system should implement
 *
 */
public interface Subject {
	
  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObservers(Observer o);
  
}
  
