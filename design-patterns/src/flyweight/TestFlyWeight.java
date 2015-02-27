package flyweight;

public class TestFlyWeight implements Runnable {

	
	Thread thread;
	
	public static void main(String[] args) {
	
	TestFlyWeight tf = new TestFlyWeight();
	
	}
		
	public TestFlyWeight() {
		
		
		String names[] = {"Ralph", "Alice", "Sam"};
		int ids[] = {1001, 1002, 1003};
		int scores[] = {45, 55, 65};
		
		double total = 0;
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
			
		}
		
		double averageScore = total / scores.length;
		
		/* Instantiated the flyweight object to be used to cycle through students */
		Student student = Student.getInstance();
		
		for (int i = 0; i < scores.length; i++) {
			student.setName(names[i]);
			student.setId(ids[i]);
			student.setScore(scores[i]);
			
			thread = new Thread(this, "second");
			thread.start();
			
			System.out.println("Name: " + student.getName());
			System.out.println("Standing: " + Math.round(student.getStanding()));
			System.out.println("");
		}
		
		
		
	}
	
	public void run() {
		Student student = Student.getInstance();
		System.out.println("Name: " + student.getName());
		System.out.println("Standing: " + Math.round(student.getStanding()));
		System.out.println("");
		
	}

}
