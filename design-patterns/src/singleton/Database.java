package singleton;

/**
 * <h1> Singleton pattern </h1>
 * <p>
 * This class has the pattern applied. The key aspects include
 *  1. making the default constructor private
 *  2. creating the instance at time of declaring the variable scope
 *  3. having synchronized method to <code> getInstance() </code>
 */
public class Database {

	/**
	 * Youve removed all the overhead involved with synchronizing code just by taking the object-creation code out of the
     * getInstance method.
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
