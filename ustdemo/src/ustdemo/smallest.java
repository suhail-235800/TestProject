package ustdemo;

import java.util.Scanner;

public class smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,small;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st number");
		a =in.nextInt();
		System.out.println("Enter 2nd number");
		b =in.nextInt();
		System.out.println("Enter 3rd number");
		c =in.nextInt();
		if((a<b) && (a<c)) {
			System.out.println("smallest is"+a);
		}
		else if((b<c) && (b<a)) {
			System.out.println("Smallest is"+b);
		}
		else {
			System.out.println("Smallest is "+c);
		}
		
	}

}
