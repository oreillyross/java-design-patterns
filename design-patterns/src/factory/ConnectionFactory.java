package factory;

public abstract class ConnectionFactory {

	public ConnectionFactory() {
		
	}
	
	protected abstract Connection createConnection(String type);
}
