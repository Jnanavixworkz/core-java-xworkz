class BankAccountTester{
public static void main(String test[]){
	BankAccount.credit(20000);
	double currentBalance1 = BankAccount.getBalance();
	System.out.println(currentBalance1);
	BankAccount.debit(300);
	double currentBalance = BankAccount.getBalance();
	System.out.println(currentBalance);
	BankAccount.credit(12000);
	BankAccount.credit(200);
	BankAccount.credit(4000);
	BankAccount.getBalance();
	System.out.println(BankAccount.getBalance());
}
}