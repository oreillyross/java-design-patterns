package chainofresponsibility;

public class FrontEnd implements Help {

    Help successor;
    
    public FrontEnd(Help h) {
		successor = h;
	}
	
	@Override
	public void getHelp(int helpConstant) {

		
	}

	
	
}
