public class Addition extends transaction {
	private int transaction;
	public Addition(int accountNumber, String description, double amount) {
		super(accountNumber, description, amount);
		transaction = newTransaction();
	}
	public double add(double change){
		double newBalance = 0;
		App app = new App();
		
		newBalance = app.getBalance() + change;
		return newBalance;
	}
	public int getTransaction(){
		return transaction;
	}
}
