package ustdemo;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner in = new Scanner(System.in);
		
		int i,j,n;
		System.out.println("enter the number of rows:");
		n = in.nextInt();
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
		for(i=n-1;i>0;i--) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
