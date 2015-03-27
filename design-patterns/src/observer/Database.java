/**
 * 
 */
package observer;

import java.util.Vector;

/**
 *  <h1> This is the concrete class which implements the {@link observer.Subject} </h1>
 * 
 *  
 * 
 *
 */

public class Database implements Subject {

	private Vector<Observer> observers;
	private String operation;
	private String record;

	/**
	 * To keep track of the observers use of a Vector is instantiated in the constructor. 
	 */
	public Database() {
		observers = new Vector<Observer>();
	}

	/** 
	 * This method takes care of registering an observer passed in as a reference
	 * @see observer.Subject#registerObserver(observer.Observer)
	 */
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	/**
	 * This method takes care of removing observers passed in as a reference.
	 * @see observer.Subject#removeObserver(observer.Observer)
	 */
	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);		
	}

	/**
	 * 
	 * The single update method of each observer is called here passing the DB operation and record being updated. The logic to notify all observers needs
	 * to be encapsulated in this class and specifically in this method. It consists of looping through the vector of observers to call their update methods
	 * respectively. 
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
