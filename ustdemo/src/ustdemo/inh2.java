package ustdemo;

class Member{
	
	String name ;
	int age;
	int pno;
	String addr;
	int sal;
	void printSalary() {
		System.out.println(sal);
	}
	void show() {
		System.out.println(name+" "+age+" "+pno+" "+addr+" "+sal+" ");
	}
	                                 	
}


class Employee extends Member{
	
	String spec;
	
}

class Manager extends Member{
	
	String dept;
	
}

public class inh2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		e.name = "abc";
		e.age = 18;
		e.pno = 221223131;
		e.addr="abcssjcsj";
		e.sal=12000;
		e.show();
		
		Manager m = new Manager();
		m.name = "abac";
		m.age = 19;
		m.pno = 22122131;
		m.addr="abssjcsj";
		m.sal=1200;
		m.show();
		
		
		
		
	}

}