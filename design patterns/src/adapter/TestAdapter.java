package adapter;

public class TestAdapter {

	public static void main(String[] args) {
      AceClass aceObject = new AceClass();
      aceObject.setName("Carey Grant");
      
      AceToAcmeAdapter acetoacmeadapter = new AceToAcmeAdapter(aceObject);
      
      System.out.println("Customers first name is " + acetoacmeadapter.getFirstName());
      System.out.println("Customers last name is " + acetoacmeadapter.getLastName());
      
	}

}
