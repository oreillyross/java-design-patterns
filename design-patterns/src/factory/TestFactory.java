package factory;

public class TestFactory {

  public static void main(String[] args) {
    
    SecureFactory securefactory;

    securefactory = new SecureFactory();
    Connection connection = securefactory.createConnection("MySQL");
    System.out.println(connection.description());
        
  }


}
