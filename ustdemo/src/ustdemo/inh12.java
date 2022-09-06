package ustdemo;
class A1{
	static void print() {
		System.out.println("parent");
	}
	
}
class B1 extends A1{
	static void print() {
		System.out.println("child");
	}
}
public class inh12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A1 a1 =new A1();
		B1 b1 =new B1();
		A1 obj = new B1();
		a1.print();
		b1.print();
		obj.print();
		
	}

}
