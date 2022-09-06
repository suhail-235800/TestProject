package ustdemo;

class PrintNumber{
	void printn(int a) {
		System.out.println(a);
	}
	void printn(double a) {
		System.out.println(a);
	}
	
		
}
public class inh5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintNumber pn = new PrintNumber();
		pn.printn(5);
		pn.printn(2.5);
	}

}
