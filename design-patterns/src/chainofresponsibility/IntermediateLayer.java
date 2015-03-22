package chainofresponsibility;

/**
 * <h1> These are the layers to handle the requests - this is the mid point </h1>
 *
 */
public class IntermediateLayer implements Help {

	final int INTERMEDIATE_LAYER_HELP = 2;
	Help successor;
	
	public IntermediateLayer(Help h) {
      successor = h;
	}
	
	
	/** 
     * The intermediate layer, class IntermediateLayer, can handle help requests
     * corresponding to the INTERMEDIATE_LAYER_HELP constant. If it gets passed
     * that constant in the getHelp method, it displays a help message  otherwise,
     * it passes the help request on to the next object in the chain.
	
	 * @see chainofresponsibility.Help#getHelp(int)
	 */
	@Override
	public void getHelp(int helpConstant) {
		if (helpConstant != INTERMEDIATE_LAYER_HELP) {
			successor.getHelp(helpConstant);
		} else {
			System.out.println("This is the intermediate layer helping, cool hey!");
		}
		
	}

}
