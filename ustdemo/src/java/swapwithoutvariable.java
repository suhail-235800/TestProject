import java.util.Scanner;
public class swapwithoutvariable{
	public static void main(String args[]){

		int a,b;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers");
		a=in.nextInt();
		b=in.nextInt();
		System.out.println("Numbers are:"+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Numbers after swap are:"+a+" "+b);

		}
		
}
