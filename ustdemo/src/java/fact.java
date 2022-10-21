import java.util.Scanner;


public class fact{
public static void main(String args[]){
	int f=1,n;
	Scanner in= new Scanner(System.in);
	System.out.println("Enter the number");
	n=in.nextInt();
	if(n==0 && n==1){
		System.out.println("Factorial:1");}
	else{
	for(int i=n;i>0;i--){
		f=f*i;
	}}
	System.out.println("Factorial is"+f);
}
} 