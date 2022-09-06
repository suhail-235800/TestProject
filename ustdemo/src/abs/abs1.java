package abs;

class Parent{
	void message() {
		
	}
}
class first extends Parent{
	void message() {
		
		System.out.println("This is first subclass");
		
	}
}
class second extends Parent{
	void message() {
		
		System.out.println("This is second subclass");
		
	}
}


public class abs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		first f = new first();
		second s = new second();
		f.message();
		s.message();

	}

}
