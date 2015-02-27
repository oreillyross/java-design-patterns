package strategy;

public class Jet extends Vehicle {

	// set the correct algorithm in the constructor
	public Jet() {
		setGoalgorithm(new GoByFlyingFast());
	}
	
	

}
