package template;

public abstract class RobotTemplate {

	public final void go() {
		start();
		getParts();
		assemble();
		test();
		stop();

	}

	private void stop() {
		System.out.println("Stopping... ");

	}

	private void test() {
		System.out.println("Testing.... ");
	}

	private void assemble() {
		System.out.println("Assembling... ");
	}

	private void getParts() {
		System.out.println("Getting parts... ");

	}

	private void start() {
		System.out.println("Starting... ");

	}

}
