package chainofresponsibility;

/**
 * To keep control over the objects in your chain, make them all implement the
 * same interface.
 *
 */
public interface Help {
  
	
	/**
	 * @param helpConstant describes which help message is required
	 */
	public void getHelp(int helpConstant);
  
  
}
