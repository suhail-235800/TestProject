import java.util.Scanner;
import java.util.*;
public class ArrayException{
	
		public String getPriceDetails(){

			Scanner in = new Scanner(System.in);
			int n;
			try{
			System.out.println("enter the size");
			n=in.nextInt();
			int a[]=new int[n];
			System.out.println("enter the element");
			for(int i=0;i<n;i++){
				a[i]=in.nextInt();}
			System.out.println("enter the index of array");	
		
				int b=in.nextInt();
				return("the array element is"+a[b]);
			}catch(ArrayIndexOutOfBoundsException e){
				return("the array index out of range");
			}catch(InputMismatchException e){
				return("Input was not in correct format");		
			
			}
		}
		public static void main(String args[]){
			ArrayException obj = new ArrayException();
			System.out.println(obj.getPriceDetails());
		}
}
