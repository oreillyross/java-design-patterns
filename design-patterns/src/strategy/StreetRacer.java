package strategy;

/**
 * <h1> This class forms part of the Vehicle - subtype of Vehicle </h1>
 * The StreetRacer class extends the Vehicle abstract class. The behaviour is injected into the class by using the setGoalgorithm() method. this
 * method is called in the constructor.
 */
public class StreetRacer extends Vehicle {
	
	/**
	 *  set the correct algorithm in the constructor. This allows one to create a concrete class and inject behaviour into the class. The 
	 *  setGoalgorithm() method is inherited from the Vehicle class.
	 *
	 *  To change a StreetRacers behaviour at runtime just call the setGoalgorithm(GoAlgorithm goalgorithm) method.
	 *
	 */
	public StreetRacer() {
		setGoalgorithm(new GoByDrivingAlgorithm());
	}
	
	
}
