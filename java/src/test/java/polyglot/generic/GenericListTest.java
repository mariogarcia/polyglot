package polyglot.generic;

import java.util.List;
import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class GenericListTest{

	@Test
	public void testCreatingANewGenericList(){
		List<String> names = Arrays.asList("Mario","John");

		assertThat(names.get(0),is("Mario"));
	}

	@Test
	public void testValidatingValidTransactions(){
		List<Transaction> transactions = 
			Arrays.asList(
				new Transaction("01",2000.2),
				new Transaction("02",2000.2),
				new Transaction("03",2000.2),
				new Transaction("04",2000.2)
			);
		GenericValidator<Transaction> validator = 
			new TransactionValidator();
		for(Transaction tx : transactions){
			assertThat(validator.validate(tx), is(true));
		}
	}

	@Test
	public void testValidatingAnInvalidTransaction(){
		GenericValidator validator = 
				new TransactionValidator();
		Transaction invalidTransaction = 
				new Transaction();

		invalidTransaction.setAmount(222.3);

		boolean isValid = validator.validate(invalidTransaction);

		assertThat(isValid,is(false));
	}

	@Test
	public void testCloningAGivenObject() throws Exception {
		Transaction transaction = new Transaction("10",4000.0);
		Transaction clonedTransaction = 
				GenericUtils.copyPropertiesFrom(transaction);

		assertThat(clonedTransaction.getTransactionId(),is("10"));
		assertThat(clonedTransaction.getAmount(),is(4000.0));
	}



}
