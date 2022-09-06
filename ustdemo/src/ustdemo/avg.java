package ustdemo;
import java.util.Scanner;

public class avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i=0,sum=0,avg;
		int a[];
		a = new int[10];
		System.out.println("enter the numbers");
		for(i=0;i<10;i++) {
			a[i]=in.nextInt();
			
		}
		for(i=0;i<10;i++) {
			sum = sum + a[i];
		}
		avg=sum/10;
		System.out.println("avg is"+avg);

	}

}
