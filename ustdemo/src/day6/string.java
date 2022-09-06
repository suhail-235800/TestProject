package day6;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      String str = "Hello";
	      for(int i=0; i<str.length(); i++) {
	         System.out.println(str.charAt(i));
	      }
	      System.out.println(str.length());
	      try {
	         System.out.println(str.charAt(7));
	      }catch(StringIndexOutOfBoundsException e) {
	         System.out.println("StringIndexOutOfBoundsException caught ");
	      }
	}

}
