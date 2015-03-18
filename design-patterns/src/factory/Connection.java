package factory;


/**
 * The Connection class will have just a constructor
 * and a description method (which will return a description of the type
 * of connection).
 *
 */
public abstract class Connection {

	
	public Connection() {
		
	}
	
	public String description() {
		return "Generic!";
	}
}
