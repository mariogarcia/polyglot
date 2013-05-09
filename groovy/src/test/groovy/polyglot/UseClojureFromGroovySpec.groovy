package polyglot

import polyglot.clojure.lists
import spock.lang.Specification

class UseClojureGromGroovySpec extends Specification{

	def "Getting the message using cars"(){
		setup: "Creating a car"
			def car = new Car(brand:"Seat",model:"Leon")
		when: "Initializing Clojure"
			def clojureMessage = lists.carMessage(car.brand) 
		then: "The message should be like the following"
			clojureMessage == "Seat Rocks!!"
	}
}
