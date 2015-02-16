package template;

public abstract class RobotTemplate {

	private String name;
	
	public RobotTemplate(String name) {
		this.name = name; 
	}
	
	public final void go() {
		start();
		getParts();
		assemble();
		test();
		stop();

	}

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

	public void start() {
		System.out.println("Starting... ");

	}
	
	public String getName() {
		return name;
	}

}
