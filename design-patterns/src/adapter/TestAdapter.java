package adapter;

/** 
 * <h1> Adapter pattern - This is the test class for the pattern </h1>
 *
<<<<<<< HEAD
 * The Adapter is known as a structural pattern, as it's used to identifying a simple way to realize relationships between entities.
 * <p>
 * Uses for Adapter pattern
 *
 * <hr>
 * <ul>
 * <li> You want to use an existing class, and its interface does not match the one you need
 * <li> You want to create a reusable class that cooperates with unrelated classes with incompatible interfaces
 * </ul>
=======
 * The Adapter is known as a structural pattern, as it's used to identifying a simple way to realize relationships 
 * between entities.
 * <p>
 * An adapter uses composition to store the
*  object it’s supposed to adapt, and when the adapter’s methods are called, it
*  translates those calls into something the adapted object can understand and
*  passes the calls on to the adapted object. The code that calls the adapter
*  never needs to know that it’s not dealing with the kind of object it thinks it is,
*  but an adapted object instead.
 * 
>>>>>>> b5ab21603e1b21d4c3aa47d8dff0e8f247c42ee8
 *
  */

public class TestAdapter {
      

      /** <p>
 
	 *  <em> AceClass</em> is instantiated - this is the legacy code or class to be adapted
	 *  <em> aceObject.setName</em> method sets the name (legacy code)
	 *  <p>
	 *  An <em> AceToAcmeAdapter</em> object is costructed passing in an instance of the legacy object
	 *  This results in being able to call the new methods of class acting as adapter - <em> AceToAcmeAdapter </em>   

       *  @param args This entry method ignores the command line arguments passed in as args
       *
       */	
      public static void main(String[] args) {
       	AceClass aceObject = new AceClass();
        aceObject.setName("Carey Grant");
      
        AceToAcmeAdapter acetoacmeadapter = new AceToAcmeAdapter(aceObject);
      
        System.out.println("Customers first name is " + acetoacmeadapter.getFirstName());
        System.out.println("Customers last name is " + acetoacmeadapter.getLastName());
      
      }

}
