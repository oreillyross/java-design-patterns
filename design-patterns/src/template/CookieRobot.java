package template;

/**
 * <h1> This class also extends the RobotTemplate and defines its own implementation </h1>
 * The CookieRobot class {@link #getParts()} method displays Getting flour and sugar. . . ., the assemble method displays
 * Baking a cookie. . . ., and the test method displays Crunching a cookie. . .
 *
 */
public class CookieRobot extends RobotTemplate {

	

	public CookieRobot(String name) {
		super(name);
		
	}

	@Override
	public void getParts() {
		System.out.println("Getting cookie dough....");
	}

	@Override
	public void assemble() {
		System.out.println("baking the cookies....");
	}

	@Override
	public void test() {
		System.out.println("crunching the cookie....");
	}
}


