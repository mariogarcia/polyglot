package scala.oop

/**
 * Here I'm using the trait as an interface. Notice that
 * I'm using implements instead of extends.
 *
 * A Trait loses its sense out of Scala, because used in Java
 * or Groovy acts as an interface that needs its "Strange"
 * methods to be implemented.
 * 
 * @author mario
 *
**/
class TraitInheritance implements SimpleTrait{

	String underlying

	String underlying(){
		underlying
	}

	void underlying_$eq(String other){
		underlying == underlying
	}

	String getAnotherValue(){
		"Groovy Rocks"
	}
}
