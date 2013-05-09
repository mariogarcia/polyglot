package polyglot.generic;

public class TransactionValidator implements GenericValidator<Transaction>{

	public boolean validate(Transaction tx){
		return tx.getTransactionId() != null;
	}

}
