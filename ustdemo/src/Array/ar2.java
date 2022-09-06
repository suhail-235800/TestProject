package Array;

import java.util.Scanner;

public class ar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i=0;
		int a[],n,f=0;
		a = new int[10];
		System.out.println("enter the numbers");
		for(i=0;i<10;i++) {
			a[i]=in.nextInt();
			
		}
		System.out.println("enter the number");
		n= in.nextInt();
		for(i=0;i<10;i++) {
			if(a[i]==0) {
				f=f+1;
			}
			
		}
		
		if(f==0) {
			System.out.println("not found");
		}
		else {
		System.out.println(" found");}
	}

}
