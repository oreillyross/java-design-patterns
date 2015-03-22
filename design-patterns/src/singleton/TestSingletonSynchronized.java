package singleton;


/**
 * <h1> Singleton pattern </h1>
 * <p>
 * The Singleton design pattern is all about making sure that you can instantiate
 * only one object of a particular class.
 * <p>
 * You use the Singleton design pattern when you want to either restrict
 * resource use (instead of creating numbers of large objects without limit) or
 * when you have a sensitive object whose data shouldnt be accessed by multiple
 * instances (such as a registry).
 *
 */
public class TestSingletonSynchronized implements Runnable {

	Thread thread;
	
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
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
		Database db = Database.getInstance("employees");
		
		System.out.println("This is the " + db.getName() + " database");
	}

}
