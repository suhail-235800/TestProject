import java.util.Scanner;
public class factors{
	public static void main(String args[]){

		int a,b,large=0,f=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers");
		a=in.nextInt();
		b=in.nextInt();
		System.out.println("Numbers are:"+a+" "+b);
		if(a>b){large=a;}
		else{large=b;}
		for(int i=1;i<=large;i++){
			if(((a%i)==0)&&((b%i)==0))
				{f=f+1;}}
		System.out.println("number of numbers which can divide them are:"+f);
			
		}
		
}
