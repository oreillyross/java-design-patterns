package decorator;

/**
 * <h1> Decorator pattern </h1>
 * <p>
 * The decorator pattern applies the following OOD principle quite nicely.
 * <p>
 * As much as possible, make your code closed for modification, but open for
 * extension. In other words, design your core code so that it doesnt have to be
 * modified a lot, but may be extended as needed.
 * <p>
 * it allows you to augment or extend a class dynamically at runtime
 */

public class BuildComputer {

	/**
	 * starts by creating a computer.
	 * the code wraps that computer in a wrapper that adds a hard disk.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Computer computer = new Computer();
		
		computer = new Disk(computer);
		computer = new CD(computer);
		computer = new Monitor(computer);
		
		System.out.println("You are getting a " + computer.description());
	}

}
