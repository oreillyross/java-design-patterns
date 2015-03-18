package strategy;

/**
 * <h1> Strategy pattern </h1>
 * <p>
 *
 */
public class GoByFlyingAlgorithm implements GoAlgorithm {

	/** 
	 * @see strategy.GoAlgorithm#go()
	 * 
	 * The GoByFlying algorithm, on the other hand, displays Now Im flying.
	 * 
	 */
	@Override
	public void go() {
		System.out.println("Now I am flying!");
		
	}

}
