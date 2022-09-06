package ustdemo;
import java.util.Scanner;

public class sumoedigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n,d,i;
		int even=0;
		int odd=0;
		System.out.println("enter the number");
		n = in.nextInt();
		while(n>0) {
			d=n%10;
			if(d%2==0) {
				even=even+d;
				
			}
			else {
				odd=odd+d;
			}
			n=n/10;
		}
		System.out.println("sum of odd nos is:"+odd);
		System.out.println("sum of even digits is:"+even);
		

	}

}
