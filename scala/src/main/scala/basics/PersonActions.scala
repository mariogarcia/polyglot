package basics;

/* Creating alias for importing types */
import model.{Person => P}
import System._

class PersonPrinter{

	/**
	 * This method prints all addresses that a person
	 * has
	 *
	 * @param person The person whose addresses we want to print
	 **/
	def printAddressesOfPerson(person:P){
		for (address <- person.addresses){
			out.println(address)
		}
	}

	/**
	 * Using guard clauses in for loops. This method only
	 * prints addresses starting with 2
	 *
	 * @param person
	 *
	 **/
	def printAddressesBeginningWith2(person:P){
		for(
			address<- person.addresses;
			if (address.startsWith("2"))
		){
			out.println(address)
		}
	}

}

