package decorator;

public class CD extends ComponentDecorator {

	Computer computer;
	
	public CD(Computer c) {
		computer = c;	}
	
	@Override
	public String description() {
		return computer.description() + " and a CD";
	}

}
