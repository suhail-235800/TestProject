package ustdemo;
class Print{
	void printn(int a,char c) {
		System.out.println(a+" "+c);
	}
	void printn(char c,int a) {
		System.out.println(c+" "+a);
	}
	
		
}

public class inh6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Print pn = new Print();
		pn.printn(5,'a');
		pn.printn('a',5);
		
	}

}
