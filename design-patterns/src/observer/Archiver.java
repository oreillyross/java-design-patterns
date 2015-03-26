package observer;

/**
 * <h1> Concrete class implements observer methods </h1>
 * 
 */
public class Archiver implements Observer {

	public Archiver() {
		
	}
	
	/**
	 * each update method can conduct a specific action based on a notification from the Subject
	 */
	@Override
	public void update(String operation, String record) {
		System.out.println("The Archiver says a " + operation + " operation was performed on " + record);
		
	}

}
