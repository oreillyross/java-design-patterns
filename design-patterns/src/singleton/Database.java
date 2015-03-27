package singleton;

/**
 * <h1> Singleton pattern </h1>
 * <p>
 * This class has the pattern applied. The key aspects include
 * <ol>
 * <li> making the default constructor private </li>
 * <li> creating the instance at time of declaring the variable scope
 * <li> having a synchronized method to {@link #getInstance(String name) }
 * </ol>
 */
public class Database {

	/**
	 * You have removed all the overhead involved with synchronizing code just by taking the object-creation code out of the
         * getInstance method and instead creating it at time of declaration 
	 */
	private static Database singleobject = new Database("products");
	private int record;
	private String name;
	
	private Database(String name) {
		this.name = name;
		record = 0;
	}
  public void editRecord(String operation) {
	System.out.println("Performing a " + operation + " operation" +
    " on record " + record + " in " + name + " database");
}
  
  public String getName() {
	  return name;
  }
  
  public static synchronized  Database getInstance(String name) {
	
	  return singleobject;
	
}
  
}
