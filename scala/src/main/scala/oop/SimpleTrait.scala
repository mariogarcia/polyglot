package scala.oop

/**
 * The truth is that my first impression of Scala traits is that they
 * look like abstract classes in Java.
 *
 **/
trait SimpleTrait{

	/**
	 * The underlying property. It's been initialized to
	 * default value
	 **/
	var underlying:String = _

    /**
	 * Abstract method. Needs to be implemented
	 **/
	def getAnotherValue():String

	/**
	 * This method returns a custom value using the
	 * underlying property's value
	 *
	 * @return The value of the underlying property
	 *
	 **/
	def getUnderlying():String = {
		"The underlying value is: "+underlying
	}
}
