package strategy;

/**
 * <h1> Strategy pattern </h1>
 * <p>
 *
 */
public class GoByFlyingFast implements GoAlgorithm {

	/** 
	 * @see strategy.GoAlgorithm#go()
	 * 
	 * And the GoByFlyingFast algorithm, used by jets, displays Now Im flying fast.
	 */
	@Override
	public void go() {
		System.out.println("And now I am flying fast!");
		
	}

}
