import java.util.Scanner;

public class tempconvert{

	public static void main(String args[]){

		Scanner in =new Scanner(System.in);
		double res,d;
		System.out.println("1.celsius to fahrenheit");
		System.out.println("2.Fahrenheit to celsius");
		System.out.println("enter your choice");
		int ch=in.nextInt();
		switch(ch){
			case 1: System.out.println("enter temp in celsius");
			        d=in.nextDouble();
				res = (d* 9/5) + 32;
				System.out.println("temp in fahrenheit is"+res);
				break;
			case 2: System.out.println("enter temp in fahrenheit");
			        d=in.nextDouble();
				res = (d - 32) * 5/9;
				System.out.println("temp in celsius is"+res);
				break;

            		default:
              			System.out.println("Select valid option!");

			
}

		
}

}