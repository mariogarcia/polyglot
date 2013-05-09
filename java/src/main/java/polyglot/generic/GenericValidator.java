package polyglot.generic;

/**
 * This interface should be implemented by all classes trying to validate
 * a given object
 *
 **/
public interface GenericValidator<T>{

	/**
	 * This method validates the object passed as parameter
	 *
	 * @param object2Validate the object we want to validate
	 * @return true if the object is valid false otherwise
	 *
	 **/
	public boolean validate(T object2Validate);

}
