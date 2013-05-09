package scala.oop

import spock.lang.*

class SimpleObjectSpec extends Specification{

	def "Testing inheritance using traits in Scala"(){
		when: "Creating an instance of a simple object"
			def simpleInstance = new SimpleObject("Name")
		and: "Setting the property inherited from the trait"
			simpleInstance.underlying = "Something"
		then: "We should be able to see both properties set"
			simpleInstance.name == "Name"
			simpleInstance.underlying == "The underlying value is: Something"
			simpleInstance.anotherValue == "Another Value"
	}
}
