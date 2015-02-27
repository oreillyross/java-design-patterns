package template;

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
