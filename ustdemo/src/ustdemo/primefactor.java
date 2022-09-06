package ustdemo;
import java.util.Scanner;

public class primefactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int i,n;
		int count=0;
		System.out.println("enter the number");
		n = in.nextInt();
		for(i=2;i<n;i++) {
			while(n%i==0){
				System.out.println(i+" ");
				n=n/i;
			}
		}
		if(n>2) {
			System.out.println(n);
		}
		
	}
}	
	

