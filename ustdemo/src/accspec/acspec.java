package accspec;
class Stu{
	public void print() {
		System.out.println("public");
	}
	private String name;
	protected int Roll;
	int no;
	
}
class stu1 extends Stu{
	
}
public class acspec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stu1 stu = new stu1();
		stu.print();
		stu.Roll=10;
		System.out.println(stu.Roll);
		stu.no=5;
		System.out.println(stu.no);
		stu.name="sas";
	}
	

}
