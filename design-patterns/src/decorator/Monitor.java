package decorator;




/**
 * <h1> Decorates the computer object and adds a monitor </h1>
 *
 */
public class Monitor extends ComponentDecorator {

	Computer computer;
	
	/**
	 * @param c stores a reference to the computer object that gets decorated.
	 */
	public Monitor(Computer c) {
		computer = c;	}
	
	
	@Override
	public String description() {
		return computer.description() + " and a Monitor";
	}

}
