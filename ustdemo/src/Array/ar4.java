package Array;

import java.util.Scanner;

public class ar4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int i=0,small,large;
		int a[];
		a = new int[5];
		System.out.println("enter the numbers");
		for(i=0;i<5;i++) {
			a[i]=in.nextInt();
			
		}
		small=a[0];
		large=a[0];
		for(i=0;i<5;i++) {
			if((a[i]>large)) {
				large=a[i];
				
			}
			if((a[i]<small)) {
				
				small=a[i];
			}
			
		}
		System.out.println("large is"+large);
		System.out.println("smallest is"+small);
		
		
	}

}
