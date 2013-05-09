package polyglot.basics;

/**
 * Sometimes I forget about the most basic model rules of java
 * so that's why I did this reminder.
 *
 *
 **/
public class MemoryModelReminders{

	/**
	 * Using this object to build the examples
	 **/
	static class Person{
		public String name;
	}

	/**
	 * We're going to pass an object as a parameter to proof that
	 * objects are passed as reference.
	 **/
	public void methodWithObjectAsParameter(Person person){
		person.name = "Peter";
	}

	/**
	 * Even though it seems we are changing the reference's value
	 * we don't
	 **/
	public void methodWithPrimitiveAsParameter(int value){
		value = 10;
	}
	
	/**
	 * Are objects passed as referenecs ---> YES
	 **/
	public boolean areObjectsPassedAsReferences(){
		Person person = new Person();
		person.name = "John";
		 /* When passing objects you're passing a reference
		  * to the objects */
			methodWithObjectAsParameter(person);
	 /* Therefore if you change the value of a given property 
	  * the object will reflect the change in any of threads 
	  * sharing that object. */
		return person.name.equals("Peter");
	}

	/**
	 * Are primitives passed as values --> YES
	 * Are primitives passed as references --> NO
	 *
	 **/
	public boolean arePrimitivesPassedAsValues(){
		int something = 100;
		 /* Even if you change the value of the variable it will 
		  * remain the same */
			methodWithPrimitiveAsParameter(something);
		return something == 100;
	}

}
