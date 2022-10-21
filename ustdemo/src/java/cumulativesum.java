package Array;

import java.util.Scanner;

public class cumulativesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size");
		int n=in.nextInt();
		if(n>0) {
		int a[] = new int[n];
		System.out.println("Enter the  elements");
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum=sum+a[i];
			System.out.print(sum+ " ");
		}
		}
		else {
			System.out.println("Invalid Range");
		}
	}

}
