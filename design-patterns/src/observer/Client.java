package observer;

/**
 * <h1> </h1>
 *
 */
public class Client implements Observer {

	public Client() {
		
	}
	
	@Override
	public void update(String operation, String record) {
		System.out.println("The Client says a " + operation + " operation was performed on " + record);
		
	}

}