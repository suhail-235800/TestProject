package day7;
import java.util.*;

public class Stackex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(20);
		s.push(21);
		s.push(22);
		System.out.println("Stack:]");
		Iterator st = s.iterator();
		while(st.hasNext()) {
			System.out.println(st.next()+"");
			
		}
		s.pop();
		System.out.println("\n Stack after pop;");
		Iterator st1 = s.iterator();
		while(st1.hasNext()) {
			System.out.println(st1.next()+"");
		}

	}

}
