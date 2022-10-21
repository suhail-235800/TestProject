import java.util.Scanner;


class star1{
  public static void main(String[] args) {

       Scanner in=new Scanner(System.in);
    System.out.println("Enter the no:");
    int size=in.nextInt();
    for(int i=1;i<=size;i++){
	for(int j=i;j<=size;j++){
			System.out.print("*");
	}
	System.out.println();
}
}
}