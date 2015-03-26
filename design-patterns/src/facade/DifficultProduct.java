package facade;

/**
 *
 * <h1> This would be the third party library which needs a simpler interface (or facade) </h1>
 * <p>
 * It has an exagerated number of methods which each need to be called to set the characters of the name. And a single get method to return the name as a string
 *
 */
public class DifficultProduct {

	char nameChars[] = new char[7];

	public DifficultProduct() {
	}

	public void setFirstNameCharacter(char c) {
		nameChars[0] = c;
	}

	public void setSecondNameCharacter(char c) {
		nameChars[1] = c;
	}

	public void setThirdNameCharacter(char c) {
		nameChars[2] = c;
	}

	public void setFourthNameCharacter(char c) {
		nameChars[3] = c;
	}

	public void setFifthNameCharacter(char c) {
		nameChars[4] = c;
	}

	public void setSixthNameCharacter(char c) {
		nameChars[5] = c;
	}

	public void setSeventhNameCharacter(char c) {
		nameChars[6] = c;
	}

	public String getName() {
		return new String(nameChars);

	}
}
