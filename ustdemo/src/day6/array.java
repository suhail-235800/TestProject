package day6;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int ar[] = { 1, 2, 3, 4, 5 };
        try {
            for (int i = 0; i <= ar.length; i++)
                System.out.print(ar[i]+" ");
        }
        catch (Exception e) {
            System.out.println("\nException caught");
        }
	}

}
