package ustdemo;
import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
	
		int i,j,n;
		System.out.println("enter the number of rows:");
		n = in.nextInt();
		
		for(i=1;i<10;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}