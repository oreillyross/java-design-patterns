package adapter;

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
	public void getFirstName() {
		return firstName;
	}

	@Override
	public void getLastName() {
		return lastName;
	}

}
