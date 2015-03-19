package strategy;

/**
 * <h1> This interface forms part of the Go behaviour separated out from Vehicle class </h1>
 * <p>
 * The GoAlgorithm interface has one method: go. To make sure any algorithm
*  can be used by any Vehicle, all algorithms should implement this
*  interface, which means they all have to define a go method
 *
 */
public interface GoAlgorithm {
  
	public void go();
	
}
