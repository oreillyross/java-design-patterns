package chainofresponsibility;

public class IntermediateLayer implements Help {

	final int INTERMEDIATE_LAYER_HELP = 2;
	Help successor;
	
	public IntermediateLayer(Help h) {
      successor = h;
	}
	
	
	@Override
	public void getHelp(int helpConstant) {
		if (helpConstant != INTERMEDIATE_LAYER_HELP) {
			successor.getHelp(helpConstant);
		} else {
			System.out.println("This is the intermediate layer helping, cool hey!");
		}
		
	}

}
