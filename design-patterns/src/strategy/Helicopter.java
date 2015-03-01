package strategy;

public class Helicopter extends Vehicle {

	// set the correct algorithm in the constructor
	/**
	 * when you want to use a particular algorithm in a derived class, all
     * you’ve got to do is to call the setGoAlgorithm method with the correct
     * algorithm object
	 */
	public Helicopter() {
		setGoalgorithm(new GoByFlyingAlgorithm());
	}
	
	

}
