
public class Subtraction extends transaction{
	public Subtraction(int accountNumber, String description, double amount) {
		super(accountNumber, description, amount);
	}
	public double subtract(double change){
		double newBalance = 0;
		App app = new App();
		
		newBalance = app.getBalance() + change;
		return newBalance;
	}
}
