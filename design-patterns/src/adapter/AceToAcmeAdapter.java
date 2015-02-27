package adapter;

public class AceToAcmeAdapter implements AcmeInterface {

	AceClass aceobject;
	String firstname;
	String lastname;
	
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
