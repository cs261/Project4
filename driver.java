public class driver {
	public static void main(String [] args){
		App myAccount = new App();
		myAccount.add(100, "Paycheck");
		myAccount.add(30, "First check");
		myAccount.subtract(12.18, "Home Depot");
		myAccount.add(30.50, "deposited a Check");
		myAccount.add(22.50, "friend paid me back");
		myAccount.subtract(23.34, "Home Depot");
		myAccount.run();
	}
}
