package template;


/**
 * Template Method will define the skeleton of an algorithm in an operation, deferring some
 * steps to subclasses. Template Method lets subclasses redefine certain steps
 * of an algorithm without changing the algorithm’s structure
 *
 */
public class TestTemplate {

	public static void main(String[] args) {
		RobotTemplate autorobot = new AutomotiveRobot("auto robot");
		System.out.println("This is a " + autorobot.getName() + " at work");
		autorobot.go();
		System.out.println("");
		RobotTemplate cookierobot = new CookieRobot("cookie robot");
		System.out.println("This is a " + cookierobot.getName() + " at work");
		cookierobot.go();
	}

}
