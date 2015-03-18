package chainofresponsibility;

/**
 * <h1> These are the layers to handle the requests - this is the starting point </h1>
 *
 */
public class FrontEnd implements Help {

    final int FINAL_FRONT_END_HELP = 1;
	Help successor;
    
    public FrontEnd(Help h) {
		successor = h;
	}
	
	/** 
	 * The front end can only handle help requests about the front end, which 
     * uses the constant FRONT_END_HELP. If the constant passed to the FrontEnd
     * objects getHelp method is not FRONT_END_HELP, it should pass the help
     * request to the next object in the chain; otherwise, it knows it can handle
     * this help request and will display a help message
	 * 
	 * @see chainofresponsibility.Help#getHelp(int)
	 */
	@Override
	public void getHelp(int helpConstant) {
      if (helpConstant != FINAL_FRONT_END_HELP) {
    	  successor.getHelp(helpConstant);
      } else {
    	  System.out.println("This is the front end. Don't you like it!");
      }
		
	}

	
	
}
