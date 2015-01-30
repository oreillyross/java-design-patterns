package strategy;

public class StreetRacer extends Vehicle {
	
	// set the correct algorithm in the constructor
	public StreetRacer() {
		setGoalgorithm(new GoByDrivingAlgorithm());
	}
	
	
}
