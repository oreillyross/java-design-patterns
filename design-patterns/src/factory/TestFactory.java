package factory;

/**
 * <h1> Factory pattern </h1>
 * 
 * the Factory Method design pattern should “Define
 * an interface for creating an object, but let subclasses decide which class to
 * instantiate. Factory method lets a class defer instantiation to subclasses.”
 *  <p>
 * The GoF Factory Method design pattern gives you more flexibility than the
 * traditional object factory. The GoF way of doing things means that you define
 * how factory methods should work and leave it up to subclassers to implement
 * the actual factory.
 * 
 *
 */
public class TestFactory {

  public static void main(String[] args) {
    
    SecureFactory securefactory;

    securefactory = new SecureFactory();
    Connection connection = securefactory.createConnection("MySQL");
    System.out.println(connection.description());
        
  }


}
