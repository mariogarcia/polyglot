package polyglot

import polyglot.clojure.sample.ClojureUtils
import spock.lang.Specification

class UseClojureGromGroovySpec extends Specification{

	def "Getting the message using cars"(){
		setup: "Creating a car"
			def car = new Car(brand:"Seat",model:"Leon")
      def util = new ClojureUtils()
		when: "Initializing Clojure"
      def instanceMessage = util.lowerit(car.brand)
      def staticMessage = ClojureUtils.upperit(car.brand)
		then: "The message should be like the following"
      instanceMessage == "seat" 
      staticMessage == "SEAT"
	}

  def "Double a given number"(){
    when:
      def numbers = [1,2,3,4]
      def doubleValue = new ClojureUtils().doubleThirdValue(numbers)
    then:
      doubleValue == 6
  }
}
