package ustdemo;

abstract class C {
	public void a() {
		System.out.println("a");
	}
	public abstract void b();
	public abstract void c();
}

abstract class D extends C{

	public void b() {
		System.out.println("b");
	}
}
class E extends D{

	public void c() {
		System.out.println("c");
	}
}
public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D cc = new E();
		cc.a();
		cc.b();
		cc.c();
		
		
	}

}
