package ustdemo;
class degree{
	
	void getDegree() {
		System.out.println("i got a degree");
	}
	
}

class Undergraduate extends degree{
	
	void getDegree() {
		System.out.println("i am an undergraduate");
	}
	
}


class Postgraduate extends degree{
	
	void getDegree() {
		System.out.println("i am a postgraduate");
	}
	
}

public class inh9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		degree d = new degree();
		Undergraduate un = new Undergraduate();
		Postgraduate pg = new Postgraduate();

		d.getDegree();
		un.getDegree();
		pg.getDegree();
	}

}
