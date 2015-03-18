package facade;



public class TestFacade {

	public static void main(String[] args) {
		SimpleProductFacade sp = new SimpleProductFacade();
		sp.setName("printer");

		System.out.println("This product is a : " + sp.getName());
	}

}
