package template;

/**
 * <h1> A subclass which has specific implementation of a template method </h1>
 * The automotive robot should override a few of the RobotTemplate
 * methods; for example, {@link #getParts()} should now display Getting a
 * carburetor. . . ., {@link #assemble()} should now display Installing
 * the carburetor. . . ., and {@link #test()} should display Revving the
 * engine.
 *
 */
public class AutomotiveRobot extends RobotTemplate {
	
	
	
	/**
	 * 
	 * @param name one can add extra methods to the subclasses such as a constructor which sets the name
	 */
	public AutomotiveRobot(String name) {
		super(name);
		
	}

	@Override
	public void getParts() {
		System.out.println("Getting a carburetor....");
	}

	@Override
	public void assemble() {
		System.out.println("Installing the carburetor....");
	}

	@Override
	public void test() {
		System.out.println("Revving the engine....");
	}
}
