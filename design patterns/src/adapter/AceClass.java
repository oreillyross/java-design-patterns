package adapter;

public class AceClass implements AceInterface {

	String name;
	
	@Override
	public void setName(String n) {
	  name = n;
		
	}

	@Override
	public String getName() {
		return name;
	}

}
