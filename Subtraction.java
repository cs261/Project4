public class Subtraction extends transaction{
	private int transaction;
	public Subtraction(String description, double amount) {
		super(description, amount);
		transaction = newTransaction();
	}
	public double subtract(double change){
		double newBalance = 0;
		App app = new App();
		
		newBalance = app.getBalance() + change;
		return newBalance;
	}
	public int getTransaction() {
		return transaction;
	}
}
