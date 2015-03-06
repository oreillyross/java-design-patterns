package decorator;

/**
 * <h1> decorator </h1>
 * <p>
 * Each extension decorating or extending the original class functionality should extend the {@link ComponentDecorator} 
 * class. 
 *
 */
public class CD extends ComponentDecorator {

	Computer computer;
	
	/**
	 * @param c stores a reference to the original computer object which is being decorated (or extended)
	 */
	public CD(Computer c) {
		computer = c;	}
	
	/**
	 * @see decorator.ComponentDecorator#description()
	 * 
	 * @return "and a CD " to the return value from the wrapped object’s description method
	 * 
	 */
	@Override
	public String description() {
		return computer.description() + " and a CD";
	}

}
