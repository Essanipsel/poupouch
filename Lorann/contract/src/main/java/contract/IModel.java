package contract;

import java.util.Observable;

/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
/**
 * @author Martial
 *
 */
public interface IModel {

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	/**
	 * @return
	 */
	String getMessage();

	/**
	 * Load the message.
	 *
	 * @param key
	 *          the key
	 */
	void loadMessage(String key);

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	/**
	 * @return
	 */
	Observable getObservable();
}
