package strategy;

/**
 * <h1> This concrete class implements the go() behaviour of GoAlgorithm interface  </h1>
 * <p>
 * This class forms part of the GoAlgorithm behaviours. The idea is that you seperate the behaviour from the Vehicle and can then 
 * polymorphically add a sub-classed concrete behaviour 
 *
 */
public class GoByDrivingAlgorithm implements GoAlgorithm {

	/** 
	 * 
	 * @see strategy.GoAlgorithm#go()
	 * <p>
	 * The first algorithm, GoByDrivingAlgorithm, displays Now I am driving.
	 * 
	 */
	@Override
	public void go() {
		System.out.println("Now I am driving!");
		
	}
  
}
