package template;

public abstract class RobotTemplate {

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

}
