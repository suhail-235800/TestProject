package ustdemo;
class data{
	int i;
	void printNum() {
		System.out.println(i);
	}
}
class subdata extends data{
	

	int j;
	void printNum() {
		System.out.println(j);
	}
}


public class inh11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subdata sd = new subdata();
		sd.i=10;
		sd.j=10;
		sd.printNum();
		
	}

}
