package scala.oop

import spock.lang.Specification

class TraitInheritanceSpec extends Specification{

	def "Using a trait as an interface in Groovy"(){
		setup: "Creaing an instance of TraitInheritance"
			def instance = new TraitInheritance()
		when: "Setting property values"
			instance.underlying = "Underlying value"
		then: "Getting values back"
			instance.underlying == "Underlying value"
			instance.anotherValue == "Groovy Rocks"
	}
}
