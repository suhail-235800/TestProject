package ustdemo;
class bank{
	void getBalance() {
		System.out.println(0);
	}
}
class BankA extends bank{
	void getBalance() {
		System.out.println(100);
	}
}

class BankB extends bank{
	void getBalance() {
		System.out.println(200);
	}
}
class BankC extends bank{
	void getBalance() {
		System.out.println(300);
	}
}
public class inh10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankA aa = new BankA();
		BankB ba = new BankB();
		BankC ca = new BankC();
		aa.getBalance();
		ba.getBalance();
		ca.getBalance();
	}

}
