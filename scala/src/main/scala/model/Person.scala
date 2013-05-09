package model

/**
 * Typical abstraction of person
 *
 **/
class Person(var name:String) {

	var addresses:List[String] = List()
	var age:Int = _

	override def toString:String = {
		"[Person: name="+name+",age="+age+"...]"
	}
}
