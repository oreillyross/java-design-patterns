package decorator;

public class CD extends ComponentDecorator {

	Computer computer;
	
	public CD(Computer c) {
		computer = c;	}
	
	/* (non-Javadoc)
	 * @see decorator.ComponentDecorator#description()
	 * 
	 * it adds and a CD to the return value from the wrapped object’s description method
	 * 
	 */
	@Override
	public String description() {
		return computer.description() + " and a CD";
	}

}
