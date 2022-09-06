package ustdemo;
class encap{
	private int rolln;
	private String name;
	public int getRolln() {
		return rolln;
	}
	public void setRolln(int rolln) {
		this.rolln = rolln;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class encaps {
	public static void main(String[] args) {
	
	encap e1 =  new encap();
	e1.setName("abc");
	e1.setRolln(20);
	System.out.println(e1.getName());
	System.out.println(e1.getRolln());}

}
