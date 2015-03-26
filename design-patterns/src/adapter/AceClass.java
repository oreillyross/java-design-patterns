package adapter;

/** <h1> This is the orginal class to be adapted </h1>
 * 
 * The Ace class implements the two methods defined in the AceInterface. 
 *   
 */
public class AceClass implements AceInterface {

 /** Ace objects store the name as a single string.
  */
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
