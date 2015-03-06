package decorator;

/**
 * <h1> Decorator pattern </h1>
 * <p>
 * This class is the key to the decorator pattern. It allows classes which want to decorate the class {@link Computer}
 * to extend from this class and decorate or extend the <code> description() </code> method
 */
public abstract class ComponentDecorator extends Computer {

	@Override
	public abstract String description();
	
}
