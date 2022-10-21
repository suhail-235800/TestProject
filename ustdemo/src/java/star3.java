import java.util.Scanner;
 public class star3{
  public static void main(String[] args) {

    Scanner in=new Scanner(System.in);
    System.out.println("Enter the no:");
    int size=in.nextInt();
    for (int i = 1; i <= size; i++) {
      for (int j = size; j > i; j--) {
        System.out.print(" ");
      }

      for (int k = 0; k < i * 2 - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }


  }
}