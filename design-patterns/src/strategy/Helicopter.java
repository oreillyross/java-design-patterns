package strategy;

public class Helicopter extends Vehicle {

	/**
	 * when you want to use a particular algorithm in a derived class, all
     * youve got to do is to call the setGoAlgorithm method with the correct
     * algorithm object
	 */
	public Helicopter() {
		setGoalgorithm(new GoByFlyingAlgorithm());
	}
	
	

}
