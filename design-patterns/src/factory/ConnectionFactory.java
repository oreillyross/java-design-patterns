package factory;

/**
 * This is the factory class which is abstract. Forces subclass factories (more specialised) to implment the <code>
 * createConnection </code> method
 *
 */
public abstract class ConnectionFactory {

	public ConnectionFactory() {
		
	}
	
	/**
	 * Besides an empty constructor, the important method here is the factory
     * method createConnection. I make this method abstract so that any subclasses
     * have to implement it. This method takes one argument — the type of
     * connection you want to create.
	 * @param type What type of connection to return
	 * @return the connection
	 */
	protected abstract Connection createConnection(String type);
}
