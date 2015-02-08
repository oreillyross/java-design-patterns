package decorator;

public class BuildComputer {

	public static void main(String[] args) {
		Computer computer = new Computer();
		
		computer = new Disk(computer);
		computer = new CD(computer);
		computer = new Monitor(computer);
		
		System.out.println("You are getting a " + computer.description());
	}

}
