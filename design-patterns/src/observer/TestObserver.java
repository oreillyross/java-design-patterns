package observer;

/**
 * <h1> Observer pattern definition </h1>
 * <p>
 * defines a one to many dependency between objects so that when one object changes state,
 * all of its dependents are notified and updated automatically
 *
 */

public class TestObserver {

	public static void main(String[] args) {
      
		Database database = new Database();
		Archiver archiver = new Archiver();
		Client client = new Client();
		Boss boss = new Boss();
		
		database.registerObserver(archiver);
		database.registerObserver(boss);
		database.registerObserver(client);
		
		database.editRecord("delete", "record one");
		
		

	}

}
