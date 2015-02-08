package observer;

public class Archiver implements Observer {

	public Archiver() {
		
	}
	
	@Override
	public void update(String operation, String record) {
		System.out.println("The Archiver says a " + operation + " operation was performed on " + record);
		
	}

}
