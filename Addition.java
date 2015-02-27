
public class Addition extends transaction {
	public Addition(int accountNumber, String description, double amount) {
		super(accountNumber, description, amount);
	}
	public double add(double change){
		double newBalance = 0;
		App app = new App();
		
		newBalance = app.getBalance() + change;
		return newBalance;
	}
}
