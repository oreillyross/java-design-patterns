package adapter;

/**
 * <h1> This is the actual adapter </h1>
 * <p>
 * 
 * The adapter lets you plug Ace objects (from the user end) into the Acme back end. To adapt Ace to Acme objects 
 * the name is split with the Ace object passed in the constructor.
 * <p>
 * To mimic an Acme object the adaptor implements the {@link AcmeInterface}
 *
 */
public class AceToAcmeAdapter implements AcmeInterface {

	/**
	 * The adapter needs to store a local copy of the {@link AceClass} object it is going to adapt. 
	 */
	AceClass aceobject;
	String firstname;
	String lastname;
	
	/**
	 * @param a this is the AceClass passed in and can then adapt its private fields to match the 
	 * Acme object it is supposed to mimic.
	 */
	public AceToAcmeAdapter(AceClass a) {
	  aceobject = a;
	  firstname = aceobject.getName().split(" ")[0];
          lastname = aceobject.getName().split(" ")[1];
	}
	
	@Override
	public void setFirstName(String f) {
		firstname = f;
		
	}

	@Override
	public void setLastName(String l) {
		lastname = l;
		
	}

	@Override
	public String getFirstName() {
		return firstname;
	}

	@Override
	public String getLastName() {
		return lastname;
	}

}
