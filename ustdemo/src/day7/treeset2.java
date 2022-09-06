package day7;

import java.util.TreeSet;
import java.util.*;

public class treeset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("green");
		ts.add("red");
		ts.add("blue");
		System.out.println("tree is ");
		Iterator i = ts.iterator();
		while(i.hasNext()) {
			System.out.println(i.next()+"");
		}
	}

}
