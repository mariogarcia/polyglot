package polyglot.basics;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class MemoryModelRemindersTest{

	@Test
	public void testObjectsArePassedAsReference(){
		MemoryModelReminders reminder = new MemoryModelReminders();
	 /* Objects are passed as reference */
		assertThat(reminder.areObjectsPassedAsReferences(),is(true));
	}

	@Test
	public void testValuesArePassedAsValues(){
		MemoryModelReminders reminder = new MemoryModelReminders();
	 /* Primitives are passed as values */
		assertThat(reminder.arePrimitivesPassedAsValues(),is(true));
	}
}
