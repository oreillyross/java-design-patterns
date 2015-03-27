package strategy;

/**
 * <h1>This concrete class implements the go() method inherited from GoAlgorithm interface  </h1>
 * 
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
