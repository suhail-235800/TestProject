package ustdemo;

class Parent{
	
	void show() {
		System.out.println("This is parent class");
	}
}

class Child extends Parent{
	
	void show() {
		System.out.println("This is child class");
	}
}


public class inh1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p = new Parent();
		Child c = new Child();
		Parent pc = new Child();
		p.show();
		c.show();
		pc.show();
		
		
		
	}

}
