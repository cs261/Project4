
public abstract class transaction {
	private static int transNumber = 1423564;
	private double change;
	private String description = "";
	
	public transaction(int accountNumber, String description, double amount){
		this.description = description;
		this.change = amount;
	}
	public double getChange(){
		return change;
	}
	
	abstract public int getTransaction();
	
	public int newTransaction(){
		return transNumber++;
	}
	public String getDescription() {
		return description;
	}
	public void print(){
		System.out.printf("%-15d %-20s %12.2f", getTransaction(), getDescription(), getChange());
		System.out.println();
	}
}
