package facade;

/**
 * <h1> This class is the heart of the facade pattern </h1>
 *
 * 
 */
public class SimpleProductFacade {

	/**
	 * The class needs to store a reference to the complicated class (third party library) which it needs to wrap essentially
	 */
	DifficultProduct difficultProduct;

	/**
	 * The constructor simply creates a new instance of the complicated class {@link DifficultProduct}. In a real world example you may simply need to pass a reference to the object. 
	 */
	public SimpleProductFacade() {
		difficultProduct = new DifficultProduct();
	}

	/**
	 * This method is one of the (potentially many) methods which simplifies the 7 setFirstNameCharacter() methods 
	 * @param n By passing in a string the method then references the chars and calls each {@link DifficultProduct} method
	 */
	public void setName(String n) {
		char chars[] = n.toCharArray();
		if (chars.length > 0) {
			difficultProduct.setFirstNameCharacter(chars[0]);
		}
		if (chars.length > 1) {
			difficultProduct.setSecondNameCharacter(chars[1]);
		}
		if (chars.length > 2) {
			difficultProduct.setThirdNameCharacter(chars[2]);
		}
		if (chars.length > 3) {
			difficultProduct.setFourthNameCharacter(chars[3]);
		}
		if (chars.length > 4) {
			difficultProduct.setFifthNameCharacter(chars[4]);
		}
		if (chars.length > 5) {
			difficultProduct.setSixthNameCharacter(chars[5]);
		}

		if (chars.length > 6) {
			difficultProduct.setSixthNameCharacter(chars[6]);
		}
	}

	public String getName() {
		return difficultProduct.getName();
	}
}
