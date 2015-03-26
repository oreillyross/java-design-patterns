package adapter;



/**
 * <h1> The interface from the system to be adapted  </h1>
 *
 *  This is the interface which specifies the two methods that Ace objects implement. This is part of the 
 *  system to be adapted. It has two methods only.
 */
public interface AceInterface {
  
	public void setName(String n);
	public String getName();
}
