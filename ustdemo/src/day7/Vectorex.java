package day7;
import java.util.*;
public class Vectorex {
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		v.add("hello");
		v.add("hi");
		v.add("bye");
		Iterator vi = v.iterator();
		while(vi.hasNext()) {
			System.out.println(vi.next()+"");
		}
		
	}
	

}
