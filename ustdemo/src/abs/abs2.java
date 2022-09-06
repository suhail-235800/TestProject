package abs;

abstract class Animals{
	public abstract void cats();
	public abstract void dogs();
	
}
class Cats extends Animals{
	public void cats() {
		System.out.println("Cats meow");
	}

	@Override
	public void dogs() {
		// TODO Auto-generated method stub
		
	}
}

class Dogs extends Animals{
	public void dogs() {
		System.out.println("Dogs bark");
	}

	@Override
	public void cats() {
		// TODO Auto-generated method stub
		
	}
}
public class abs2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cats c = new Cats();
		Dogs d = new Dogs();
		c.cats();
		d.dogs();
	}

}
