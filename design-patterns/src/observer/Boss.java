package observer;

/**
 * <h1> This is a concrete class which implements the Observer interface </h1>
 * 
 */

public class Boss implements Observer {

	public Boss() {
		
	}
	
	/**
	 * each update method can conduct a specific action based on a notification from the Subject
	 */
	@Override
	public void update(String operation, String record) {
		System.out.println("The Boss says a " + operation + " operation was performed on " + record);
		
	}

}
