package adapter;

/**
 * <h1> Adapter pattern </h1>
 * <p>
 * Acme objects are based on the Acme class, which implements the AcmeInterface. 
 * <p>
 * The Acme objects store the name as first and last name.
 */
public class AcmeClass implements AcmeInterface {

    String firstName;
    String lastName;
	
	@Override
	public void setFirstName(String f) {
	  firstName = f;  	
	}

	@Override
	public void setLastName(String l) {
		lastName = l;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

}
