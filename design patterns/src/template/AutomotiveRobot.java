package template;

public class AutomotiveRobot extends RobotTemplate {
	public void getParts() {
		System.out.println("Getting a carburetor....");
	}

	public void assemble() {
		System.out.println("Installing the carburetor....");
	}

	public void test() {
		System.out.println("Revving the engine....");
	}
}
