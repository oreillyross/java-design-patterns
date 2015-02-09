package chainofresponsibility;

public class FrontEnd implements Help {

    final int FINAL_FRONT_END_HELP = 1;
	Help successor;
    
    public FrontEnd(Help h) {
		successor = h;
	}
	
	@Override
	public void getHelp(int helpConstant) {
      if (helpConstant != FINAL_FRONT_END_HELP) {
    	  successor.getHelp(helpConstant);
      } else {
    	  System.out.println("This is the front end. Don't you like it!");
      }
		
	}

	
	
}
