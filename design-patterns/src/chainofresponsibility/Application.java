package chainofresponsibility;

/**
 * <h1> These are the layers to handle the requests - this is the end point </h1>
 *
 *  
 */
public class Application implements Help {

	public Application() {
		
	}

     /**
       * The end of the chain is the Application object; the buck stops here. There
       * is no successor to this link in the chain, so if the getHelp method is called in
       * the Application object, it just displays a default message.
       * 
       * 
       */
	@Override
	public void getHelp(int helpConstant) {
		System.out.println("This is the application dealing with help request!");

	}

}
