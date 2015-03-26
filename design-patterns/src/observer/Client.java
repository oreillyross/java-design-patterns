package observer;

/**
 * <h1>The concrete class implments the Observer interface  </h1>
 *
 * 
 *
 * 
 *
 */
public class Client implements Observer {

	public Client() {
		
	}
	
	/**
	 * each update method can conduct a specific action based on a notification from the Subject
	 */
	@Override
	public void update(String operation, String record) {
		System.out.println("The Client says a " + operation + " operation was performed on " + record);
		
	}

}
