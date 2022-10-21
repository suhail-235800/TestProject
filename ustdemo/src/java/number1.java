import java.util.Scanner;


class number1{
  public static void main(String[] args) {

       Scanner in=new Scanner(System.in);
    System.out.println("Enter the no:");
    int size=in.nextInt();
    for(int i=1;i<=size;i++){
	for(int j=1;j<=i;j++){
			System.out.print(i);
	}
	System.out.println();
}
}
}