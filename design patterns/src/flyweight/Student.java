package flyweight;

public class Student {

	
	String name;
	int id;
	int score;
	double averageScore;
	
	public Student (double a) {
		averageScore = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public double getStanding() {
		return averageScore;
		
	}
}
