package strategy;

public class Jet extends Vehicle {

	/**
	 * when you want to use a particular algorithm in a derived class, all
     * youve got to do is to call the setGoAlgorithm method with the correct
     * algorithm object
	 */
	public Jet() {
		setGoalgorithm(new GoByFlyingFast());
	}
	
	

}
