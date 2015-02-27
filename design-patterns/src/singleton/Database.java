package singleton;

public class Database {

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
