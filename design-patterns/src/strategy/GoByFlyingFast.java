package strategy;

/**
 * <h1> This concrete class implements the go() behaviour of GoAlgorithm interface</h1>
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
