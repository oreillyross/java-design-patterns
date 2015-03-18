package strategy;

/**
 * <h1> Strategy pattern </h1>
 * This class is a specialised vehicle. It extends only the Vehcile class along with its aspects that don't change. 
 *
 */
public class StreetRacer extends Vehicle {
	
	/**
	 *  set the correct algorithm in the constructor. This allows one to create a concrete class and inject behaviour into the class. The 
	 *  setGoalgorithm() method is inherited from the Vehicle class
	 *
	 */
	public StreetRacer() {
		setGoalgorithm(new GoByDrivingAlgorithm());
	}
	
	
}
