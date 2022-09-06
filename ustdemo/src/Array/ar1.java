package Array;

import java.util.Scanner;

public class ar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i=0;
		int a[];
		a = new int[10];
		System.out.println("enter the numbers");
		for(i=0;i<10;i++) {
			a[i]=in.nextInt();
			
		}
		System.out.println("nos are");
		for(i=0;i<10;i++) {
			System.out.println(a[i]);
			
		}
		

	}
}
