package Array;

import java.util.Scanner;

public class displaycharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a[]= new int[4];
		System.out.println("enter the digit");
		for(int i=0;i<4;i++) {
			a[i]=in.nextInt();
		}
		for(int i=0;i<4;i++) {
			char c=(char) a[i];
			System.out.println(a[i]+"-"+c);
		}
	}

}
