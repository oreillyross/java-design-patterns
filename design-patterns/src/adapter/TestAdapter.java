package adapter;

/** 
 * <h1> Adapter pattern </h1>
 *
 * The Adapter is known as a structural pattern, as it's used to identifying a simple way to realize relationships 
 * 
 * between entities.
 *
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
