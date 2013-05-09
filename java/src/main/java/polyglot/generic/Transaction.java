package polyglot.generic;

public class Transaction{

	private String transactionId;	
	private Double amount;
	
	public Transaction(){}

	public Transaction(String transactionId,Double amount){
		this.transactionId = transactionId;
		this.amount = amount;
	}

	public void setTransactionId(String transactionId){
		this.transactionId = transactionId;
	}

	public void setAmount(Double amount){
		this.amount = amount;
	}

	public String getTransactionId(){
		return this.transactionId;
	}

	public Double getAmount(){
		return this.amount;
	}

}
