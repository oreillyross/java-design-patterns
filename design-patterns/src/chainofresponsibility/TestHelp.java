package chainofresponsibility;

/**
 * 
 *  <h1> The Chain of Responsibility design pattern </h1>
 *  <p>
 *  This pattern is all about connecting objects in a chain of notification; as a notification travels
 *  down the chain, its handled by the first object that is set up to deal with the
 *  particular notification.
 *  
 *  You use this pattern when not all your observers are created equal. For example,
 *  say that you have a layered application with a set chain of command for
 *  events  a mouse event may originate in a particular control, then bubble up
 *  to the controls container, then the containers window, and eventually up to
 *  the application itself. The first object that can handle the event correctly
 *  should grab it and stop the event from further bubbling.
 *  In other words, if you want to process your notifications using a hierarchical
 *  chain of objects, this is your pattern.
 *  
 */

public class TestHelp {

	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
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
