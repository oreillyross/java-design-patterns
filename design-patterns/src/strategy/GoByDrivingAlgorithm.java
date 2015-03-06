package strategy;

/**
 * <h1> Strategy pattern </h1>
 * <p>
 * 
 */
public class GoByDrivingAlgorithm implements GoAlgorithm {

	/** 
	 * 
	 * @see strategy.GoAlgorithm#go()
	 * <p>
	 * The first algorithm, GoByDrivingAlgorithm, displays Now I’m driving.
	 * 
	 */
	@Override
	public void go() {
		System.out.println("Now I am driving!");
		
	}
  
}
