package contract;
import java.util.Observable;
public interface IModel {
	
	

	

	/**
	* The Interface IModel.
	*
	* @author Jean-Aymeric Diet
	*/
	

	/**
	* Gets the message.
	*
	* @return the message
	*/
	String getMessage();

	/**
	* Load the message.
	*
	* @param key
	* the key
	*/
	void loadMessage(String key);

	/**
	* Gets the observable.
	*
	* @return the observable
	*/
	Observable getObservable();
	}


