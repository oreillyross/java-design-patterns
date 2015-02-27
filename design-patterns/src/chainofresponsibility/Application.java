package chainofresponsibility;

public class Application implements Help {

	public Application() {
		
	}

	@Override
	public void getHelp(int helpConstant) {
		System.out.println("This is the application dealing with help request!");

	}

}
