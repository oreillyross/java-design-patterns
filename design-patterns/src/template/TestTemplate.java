package template;


/**
 * <h1> Template pattern - definition </h1>
 * Template Method will “Define the skeleton of an algorithm in an operation, deferring some
 * steps to subclasses. Template Method lets subclasses redefine certain steps
 * of an algorithm without changing the algorithm’s structure.”
 * <p>
 * USAGE
 * <hr>
 * The Template Method pattern should be used:
 * <ol>
 * <li> To implement the invariant parts of an algorithm once and leave it up to subclasses to implement the behavior 
 * that can vary.
 * <li> When refactoring is performed and common behavior is identified among classes. A abstract base class 
 * containing all the common code (in the template method) should be created to avoid code duplication.
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
