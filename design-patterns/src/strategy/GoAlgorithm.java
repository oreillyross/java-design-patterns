package strategy;

/**
 * <h1> Strategy pattern </h1>
 * <p>
 * The GoAlgorithm interface has one method: go. To make sure any algorithm
*  can be used by any Vehicle, all algorithms should implement this
*  interface, which means they all have to define a go method
 *
 */
public interface GoAlgorithm {
  
	public void go();
	
}
