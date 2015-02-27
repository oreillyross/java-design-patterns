package strategy;

public class Helicopter extends Vehicle {

	// set the correct algorithm in the constructor
	public Helicopter() {
		setGoalgorithm(new GoByFlyingAlgorithm());
	}
	
	

}
