package singleton;

/**
 * <h1> Singleton pattern - definition </h1>
 *
 * The singleton pattern is one of the simplest design patterns: it involves only one class which is responsible to instantiate itself,
 * to make sure it creates not more than one instance; in the same time it provides a global point of access to that instance. In this
 * case the same instance can be used from everywhere, being impossible to invoke directly the constructor each time.
 * <p>
 * USAGE 
 * <hr>
 * <li> Logging or configuration files
 * 
 *
 */
public class TestSingleton {

        /**
	 * This tests the non-synchronized version of the pattern
	 */
	
	public static void main(String[] args) {
		Database database;
		
		database = Database.getInstance("products");
		
		System.out.println("This is the " + database.getName() + " database");
		
		database = Database.getInstance("employees");

		System.out.println("This is the " + database.getName() + " database");

	}

}
