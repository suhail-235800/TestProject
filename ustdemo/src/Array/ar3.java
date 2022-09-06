package Array;

import java.util.Scanner;

public class ar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i=0,sum=0,pro=1;
		int a[];
		a = new int[5];
		System.out.println("enter the numbers");
		for(i=0;i<5;i++) {
			a[i]=in.nextInt();
			
		}
		for(i=0;i<5;i++) {
			sum = sum + a[i];
			pro = pro * a[i];
			}
		System.out.println("sum is"+sum);
		System.out.println("pro is"+pro);
		
		

	}

}
