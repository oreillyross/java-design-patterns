package strategy;

/**
 * <h1> This interface forms part of the Go behaviour separated out from Vehicle class </h1>
 * <p>
 * The GoAlgorithm interface has one method: go. To make sure any algorithm
 *  can be used by any Vehicle, all algorithms should implement this
 *  interface, which means they all have to define a go method
 *
 * <p>
 *	the part that is going to be changing the most is the go method, so that’s the
 *	part to separate out. In design pattern terms, each implementation of the go
 *	method is called an algorithm (basically that’s just another name for a strategy).
 *	So you want to create a set of algorithms that can be used by your various
 *	StreetRacer, FormulaOne, Helicopter, and Jet objects. Doing so
 *	separates the volatile code into algorithms. Each algorithm handles one
 *	complete task, so you don’t have to spread out the handling of that task
 *	over generations of classes.
 */
 
public interface GoAlgorithm {
  
	public void go();
	
}
