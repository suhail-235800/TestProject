
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Customer customer = new Customer(101, "abcd", "abc@gmail.com");
        SavingsAccount savingsAccount = new SavingsAccount(1001, customer, 11000, 500);
        if (savingsAccount.withdraw()) {
            System.out.println(savingsAccount.getBalance());
        }
	else{System.out.println("false");
}
}

}