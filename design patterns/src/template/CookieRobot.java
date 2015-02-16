package template;

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


