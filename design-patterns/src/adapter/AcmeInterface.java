package adapter;

/**
 * <h1> Adapter pattern </h1>
 * <p>
 * This interface lists four methods. The {@link AcmeClass} implements these. The {@link AceClass} needs to be 
 * adapted to allow for these four methods to work. Taking Ace objects and making them work as if they were
 * Acme objects.   
 *
 */
public interface AcmeInterface {
  
	public void setFirstName(String f);
	public void setLastName(String l);
	public String getFirstName();
	public String getLastName();
	
}
