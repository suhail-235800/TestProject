package day6;

public class null1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = null;
        try
        {
            System.out.println(s.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointerException caught");
        }
	}

}
