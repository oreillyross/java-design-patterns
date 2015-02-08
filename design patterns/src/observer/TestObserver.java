package observer;

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
