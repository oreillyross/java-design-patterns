package template;

public class AutomotiveRobot extends RobotTemplate {
	
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
