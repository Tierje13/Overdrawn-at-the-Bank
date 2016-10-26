
public class BankAccount {
public double balance;
public String name;

public BankAccount(double b, String n){
	balance=b;
	name=n;
	
}
public void deposit(double q){
	balance=balance+q;
	
}
public void withdraw(double w){
	balance=balance-w;
}

}
