package ustdemo;
import java.util.Scanner;
public class greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st number");
		a =in.nextInt();
		System.out.println("Enter 2nd number");
		b =in.nextInt();
		if(a>b) {
			System.out.println("greatest is "+a);
		}
		else {
			System.out.println("greatest is "+b);
		}
		
	}

}
