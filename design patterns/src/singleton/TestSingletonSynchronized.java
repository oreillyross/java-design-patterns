package singleton;

public class TestSingletonSynchronized implements Runnable {

	Thread thread;
	
	
	public static void main(String[] args) {
		TestSingletonSynchronized ts = new  TestSingletonSynchronized();
	}
	
	public TestSingletonSynchronized() {
		Database db = Database.getInstance("products");
		
		thread = new Thread(this, "second");
		thread.start();
		
		System.out.println("This is the " + db.getName() + " database");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
