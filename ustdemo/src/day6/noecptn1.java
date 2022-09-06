package day6;

public class noecptn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try
		{
			int a=Integer.parseInt("abc");
			System.out.println(a);
			
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException Caught");
		}
		
	}

}
