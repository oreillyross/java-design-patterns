/**
 * 
 */
package observer;

import java.util.Vector;

/**
 * @author Ross
 * 
 * To keep track of the observers use of a Vector is instantiated in the constructor. 
 *
 */

public class Database implements Subject {

	private Vector<Observer> observers;
	private String operation;
	private String record;

	public Database() {
		observers = new Vector<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);		
	}

	/**
	 * @see observer.Subject#notifyObservers(observer.Observer)
	 * 
	 * The single update method of each observer is called here passing the DB operation and record being updated 
	 * 
	 */
	@Override
	public void notifyObservers() {
		for (Observer ob : observers) {
			ob.update(operation, record);
		}

	}
	
	public void editRecord(String operation, String record) {
		this.operation = operation;
		this.record = record;
		notifyObservers();
		
	}





}
