package strategy;

/**
 * <h1> This class forms part of the Vehicle - subtype of Vehicle </h1>
 * The Helicopter class extends the Vehicle abstract class. The behaviour is injected into the class by using the setGoalgorithm() method. this
 * method is called in the constructor.
 */
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
