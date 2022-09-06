package ustdemo;
import java.util.Scanner;

public class vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner in = new Scanner(System.in);
		System.out.println("enter age");
		age = in.nextInt();
		if (age<21) {
			System.out.println("not eligible");
		}
		else {
			System.out.println("eligible");
		}

	}

}
