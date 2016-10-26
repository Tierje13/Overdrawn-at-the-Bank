
public class Tester {

	public static void main(String[] args) {
		BankAccount bear=new BankAccount(1000, "Sally Jones");
		bear.deposit(505.22);
		System.out.println(bear.balance);
		bear.withdraw(100);
		System.out.println("The "  + bear.name + " account balance is, " + bear.balance);

	}

}
