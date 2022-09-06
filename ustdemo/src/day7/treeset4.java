package day7;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("green");
		ts.add("red");
		ts.add("blue");
		System.out.println("first is ");
		System.out.println(ts.first());
		System.out.println("last is ");
		System.out.println(ts.last());
	}

}
