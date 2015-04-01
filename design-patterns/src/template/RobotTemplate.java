package template;


/**
 * <h1> This is the abstract base class which has template methods to be overridden </h1>
 * this class will also have default implementations of each of the methods
 * corresponding to the steps in the algorithm, start, getParts, assemble,
 * test, and stop
 * <p> 
 * If a robot is fine with any of these methods, such as the start and stop
 * methods, it doesn’t have to override them. Otherwise, you can customize
 * what specific methods do in subclasses.
 *
 */
public abstract class RobotTemplate {

	private String name;
	
	public RobotTemplate(String name) {
		this.name = name; 
	}
	
	
	/**
	 * The go method executes the work a Robot has to do
	 */
	public final void go() {
		start();
		getParts();
		assemble();
		test();
		stop();

	}

	/**
	 * If a robot is fine with any of these methods, such as the start and stop
     * methods, it doesn’t have to override them. Otherwise, you can customize
     * what specific methods do in subclasses.
	 */
	public void stop() {
		System.out.println("Stopping... ");

	}

	public void test() {
		System.out.println("Testing.... ");
	}

	public void assemble() {
		System.out.println("Assembling... ");
	}

	public void getParts() {
		System.out.println("Getting parts... ");

	}

	/**
	 * If a robot is fine with any of these methods, such as the start and stop
     * methods, it doesn’t have to override them. Otherwise, you can customize
     * what specific methods do in subclasses.
	 */
	public void start() {
		System.out.println("Starting... ");

	}
	
	public String getName() {
		return name;
	}

}
