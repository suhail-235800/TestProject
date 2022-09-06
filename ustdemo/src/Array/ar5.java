package Array;

import java.util.Scanner;

public class ar5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i=0,j=0;
		int [][] a = new int[3][3];
		System.out.println("enter the numbers");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
			a[i][j]=in.nextInt();
			}
		}
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
			System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}

}
