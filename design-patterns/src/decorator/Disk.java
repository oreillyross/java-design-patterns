package decorator;

/**
 * <h1> Decorator pattern </h1>
 * a concrete wrapper, Disk, which adds a hard disk to the core computer.
 *  This class starts by extending the ComponentDecorator abstract
 *  wrapper class
 *
 */

public class Disk extends ComponentDecorator {

	
	
	Computer computer;
	
	/**
	 * 
	 * Because this is a wrapper class, it has to know what its wrapping so you can
         * pass a computer object to this classs constructor. 
	 *
	 * @param c The Disk wrapper will store the core computer object.
	 */
	public Disk(Computer c) {
		computer = c;
	}
	
	/**
	 * 
	 * You inherited the description method from the abstract ComponentDecorator class, which
         * declares an abstract description method, so Java is going to insist you need
         * to write the description method.) That method will call the core computer
         * objects description method and add the text and a disk like this
	 * @see decorator.ComponentDecorator#description()
	 */

	@Override
	public String description() {
		
		return computer.description() + " with a disk";
	}
  
}
