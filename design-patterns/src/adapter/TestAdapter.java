package adapter;

/** 
 * <h1> Adapter pattern </h1>
 *
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
 *
 */

public class TestAdapter {

      public static void main(String[] args) {
        AceClass aceObject = new AceClass();
        aceObject.setName("Carey Grant");
      
        AceToAcmeAdapter acetoacmeadapter = new AceToAcmeAdapter(aceObject);
      
        System.out.println("Customers first name is " + acetoacmeadapter.getFirstName());
        System.out.println("Customers last name is " + acetoacmeadapter.getLastName());
      
      }

}
