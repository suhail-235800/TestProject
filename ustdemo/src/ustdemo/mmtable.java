package ustdemo;
import java.util.Scanner;

public class mmtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i,k,ch;
		System.out.println("enter the number");
		ch = in.nextInt();
		switch(ch) {
			case 24:		System.out.println("multiplication table of 2 is");
							for(i=1;i<11;i++) {
							k=ch*i;
							System.out.println(ch+" * "+i+"="+k);
							}
							break;
							
			case 50:		System.out.println("multiplication table of 2 is");
							for(i=1;i<11;i++) {
							k=ch*i;
							System.out.println(ch+" * "+i+"="+k);
							}
							break;
							
			case 29:	    System.out.println("multiplication table of 2 is");
							for(i=1;i<11;i++) {
							k=ch*i;
							System.out.println(ch+" * "+i+"="+k);}
							break;
							
			default:		System.out.println("enter a choice");				
			}					
							
							
							
		
		
		
		
	}

}
