import java.util.Scanner;

public class arithmetic{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two numbers:");

       
        int p = in.nextInt();
        int q = in.nextInt();

        System.out.println("Enter your choice");
        System.out.println("1.sum");
        System.out.println("2.subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");
        System.out.println("5.Modulus");

        int c = in.nextInt();
        float Calc = 0;

        switch(c) {
          
            case 1:
                Calc = p + q;
                System.out.println("sum is:"  + Calc);
                break;

           
            case 2:
                Calc = p - q;
                System.out.println("difference is: "+ Calc);
                break;

      
            case 3:
                Calc = p * q;
                System.out.println("product is: "+ Calc);
                break;

       
            case 4:
                Calc = p / q;
                System.out.println("quotient is: "+ Calc);
                break;

           
            case 5:
                Calc = p % q;
                System.out.println("mod is: "+ Calc);
                break;

            default:
                System.out.println("Select valid option!");
        }   
    }
}