/**
 * 
 */
package observer;

/**
 * @author Ross
 * 
 * Consists of one method called update. Pass the DB operation that was performed 
 * (such as edit, delete, create etc.) and the record that was updated.
 *
 */
public interface Observer {

	public void update(String operation, String record);
}
