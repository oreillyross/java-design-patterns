package facade;


/**
 * <h1> Facade pattern (structural) - Definition </h1>
 *
 * Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
 * <p>
 * A Facade aims to make things look cleaner and more appealling.  The Facade can be used to hide the inner workings of a third party library, or some legacy code.  
 * All that the client needs to do is interact with the Facade, and not the subsystem that it is encompassing. 
 */
public class TestFacade {

	public static void main(String[] args) {
		SimpleProductFacade sp = new SimpleProductFacade();
		sp.setName("printer");

		System.out.println("This product is a : " + sp.getName());
	}

}
