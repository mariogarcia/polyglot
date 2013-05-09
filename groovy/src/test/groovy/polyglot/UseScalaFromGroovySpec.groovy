package polyglot

import model.Person
import spock.lang.Specification

import scala.collection.immutable.List as ScalaList

class UseScalaFromGroovySpec extends Specification{

	def "Create a person from a Scala class"(){
		when:"Building an instance of a person"
			def person = new Person("John")
			def addresses = ["22 Rue del Percebe"]
		and: "Setting the rest of the fields"
			person.age = 22
			person.addresses = ScalaList.fromArray(addresses.toArray())
		then:"We should be able to access all its fields"
			person
			person.name == "John"
			person.age == 22
			person.toString() == "[Person: name=${person.name},age=${person.age}...]" 
			person.addresses.size() == 1
	}

}
