import java.util.Random;
import java.util.Scanner;
public class App {
	private double accountBalance = 0;
	private TransactionList list;
	private String cin;
	private Random random = new Random();
	private Scanner in;
	
	private int accountNumber = random.nextInt(1000000) + 1000000;
	public App(){
		list = new TransactionList();
		in = new Scanner(System.in);
	};
	public void run(){
		System.out.println("Welcome to your Account");
		while(true){
			display();
			cin = in.next();
			options(cin);
		}
	}
	

	public void add(double amount, String description){
		transaction trans = new Addition(accountNumber, description, amount);
		list.add(trans);
		accountBalance += ((Addition) trans).add(amount);
	}
	public void subtract(double amount, String description){
		transaction trans = new Subtraction(accountNumber, description, (amount * -1));
		list.add(trans);
		accountBalance -= ((Subtraction) trans).subtract(amount);
	}
	public double getBalance(){
		return accountBalance;
	}
	public void search(String string){
		System.out.println("Searching for \"" + string + "\"");
		System.out.printf("%-15s %-20s %-15s %n", "Transaction", "Description", "Debit/Credit");
		System.out.println("*************************************************");
		list.search(string);
		System.out.println();
	}
	public void remove(String string){
		list.remove(string);
	}
	public void remove(int index){
		System.out.println("Removing the " + (index + 1) + "th item");
		list.remove(index);
	}
	public void print(){
		System.out.println("_________________________________________________");
		System.out.println("Account: " + accountNumber);
		System.out.printf("Account Balance: $%.2f", accountBalance);
		System.out.println();
		System.out.printf("%-15s %-20s %-15s %n", "Transaction", "Description", "Debit/Credit");
		System.out.println("*************************************************");
		list.listAll();
		System.out.println();
	}
	public void display(){
		
		System.out.println("Please choose from the following");
		System.out.println("(D) to display balance");
		System.out.println("(A) to add a Credit");
		System.out.println("(B) to add a Debit");
		System.out.println("(S) to search transactions");
		System.out.println("(R) to remove a transaction");
		System.out.println("(Q) to quit");
		System.out.println();
	}
	public void options(String ch){
		switch(ch.toLowerCase()){
		 case "d":
			 print();
			 break;
		 case "a":
			 System.out.println("Please enter the amount you wish to deposit");
			 int amount = in.nextInt();
			 in.nextLine();
			 System.out.println("Please enter the description of the transaction");
			 String description = in.nextLine();
			 add(amount, description);
			 break;
		 case "s":
			 System.out.println("what do you want to search for?");
			 in.nextLine();
			 String string = in.nextLine();
			 search(string);
			 break;
		 case "b":
			 System.out.println("Please enter the amount you wish to deposit");
			 int debit = in.nextInt();
			 in.nextLine();
			 System.out.println("Please enter the description of the transaction");
			 String comment = in.nextLine();
			 subtract(debit, comment);
			 break;
		 case "r":
			 System.out.println("Please enter the description of what you want removed");
			 in.nextLine();
			 String remove = in.nextLine();
			 remove(remove);
			 break;
		 case "q":
			 System.out.println("Thank you! Have a nice day!");
			 System.exit(0);
		}
	}
}
