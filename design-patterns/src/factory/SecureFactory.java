package factory;

/**
 * <h1> extending the factory class </h1>
 * A specialised connection can be returned depending on the input type
 *
 */
public class SecureFactory extends ConnectionFactory {

  /**
   * @param type takes a type of connection
   * @see factory.ConnectionFactory#createConnection(java.lang.String)
   */
public Connection createConnection(String type) {
  
    if (type.equals("Oracle")) {
      return new SecureOracleConnection();
    } else if (type.equals("SQL Server")) { 
      return new SQLServerConnection();
    } else if (type.equals("MySQL")) { 
      return new SecureMySqlConnection();
    } else return null;	    

  }

}

