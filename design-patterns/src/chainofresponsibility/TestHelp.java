package chainofresponsibility;

/**
 * 
 *  
 *  The Chain of Responsibility design pattern at work. Want to
 *  handle notifications in a loosely coupled way, but also have a definite chain
 *  of command in mind? This is the pattern for you.
 *  
 */

public class TestHelp {

	/**
	 */
	public static void main(String[] args) {
		
		final int FRONT_END_HELP = 1;
		final int INTERMEDIATE_LAYER_HELP = 2;
		final int GENERAL_HELP = 3;
		
		Application app = new Application();
		
		IntermediateLayer intermediatelayer = new IntermediateLayer(app);
		
		FrontEnd frontend = new FrontEnd(intermediatelayer);
		
		frontend.getHelp(INTERMEDIATE_LAYER_HELP);
		frontend.getHelp(GENERAL_HELP);
		
		

	}

}
