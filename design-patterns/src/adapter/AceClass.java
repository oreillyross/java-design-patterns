package adapter;

/**
<<<<<<< HEAD
 *
 * <h1> Adapter pattern </h1>
 *
 * 
 *  
 */

=======
 * <h1> Adapter pattern </h1>
 * 
 * The ace class implements the two methods defined in the AceInterface. This class forms part of
 * the bit to be adapted.
 * <p>
 * Ace objects store the name as a single string.
 *
 */
>>>>>>> b5ab21603e1b21d4c3aa47d8dff0e8f247c42ee8
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
