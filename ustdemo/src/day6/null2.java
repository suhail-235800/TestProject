package day6;

public class null2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ptr = null;
		 
        try
        {
            if (ptr.equals("gfg"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught");
        }
	}

}
