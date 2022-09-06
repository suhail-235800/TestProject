package day7;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("green");
		ts.add("red");
		ts.add("blue");
		System.out.println("tree is ");
		Iterator i = ts.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next()+"");
		}
	}
	

}
