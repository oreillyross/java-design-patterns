package adapter;



/**
 * <h1> Adapter pattern </h1>
 *
 *  This is the interface which specifies the two methods that Ace objects implement. This is part of the 
 *  system to be adapted. It has two methods.
 */
public interface AceInterface {
  
	public void setName(String n);
	public String getName();
}
