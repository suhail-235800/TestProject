package ustdemo;

class PrintNumber2{
	void printn(int l,int b) {
		System.out.println(l*b);
	}
	void printn(int a) {
		System.out.println(a*a);
	}
	
		
}

public class inh7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintNumber2 pn = new PrintNumber2();
		pn.printn(5);
		pn.printn(2,5);

	}

}
