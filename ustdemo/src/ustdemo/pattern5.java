package ustdemo;
import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i, j, c = 1;  
		System.out.print("Enter the number of rows you want to print: ");  
		Scanner sc = new Scanner(System.in);  
		n = sc.nextInt();  
		c = n - 1;  
		for (i = 1; i<= n; i++)  
		{  
			for (j = 1; j<= c; j++)  
			{  
				System.out.print(" ");  
			}  
			c--;  
			for (j = 1; j <= 2 * i - 1; j++)  
				{  
					System.out.print("*");  
				}  
			System.out.println("");  
		}  
		c = 1;  
		for (i = 1; i<= n - 1; i++)  
		{  
			for (j = 1; j<= c; j++)  
				{  
					System.out.print(" ");  
				}  
			c++;  
			for (j = 1; j<= 2 * (n - i) - 1; j++)  
			{  
				System.out.print("*");  
			}  
			System.out.println("");  
		}  
	}

}
