/**
 * 
 */
package observer;

/**
 * <h1> This interface should be implemented by the concrete observer classes </h1>
 * <p>
 * Consists of one method called update. The idea is to pass the DB operation that was performed 
 * (such as edit, delete, create etc.) and the record that was updated. This is the information passed as an update to the 
 * observers that are registered with the concrete class {@link Subject.class}.
  */
public interface Observer {

	public void update(String operation, String record);
}
