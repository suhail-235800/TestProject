package ustdemo;


class shape{
	
	void prints() {
		System.out.println("this is shape");
	}
	
}

class rectangle extends shape{
	
	
	 void printl() {
		
		System.out.println("This is rectangular shape");
	}
}

class circle extends shape{
	
	void printc() {
		System.out.println("This is circle shape");
	}
}

class square extends rectangle{
	
	void printsq() {
		
		System.out.println("SQUARE IS RECTANGLE");
	}
}
		


public class subclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		square s = new square();
		s.prints();
		s.printl();
	}

}
