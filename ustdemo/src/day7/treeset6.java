package day7;

import java.util.TreeSet;
import java.util.*;

public class treeset6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Integer> ts = new LinkedHashSet<Integer>();
		
		ts.add(1);
		ts.add(4);
		ts.add(5);
		ts.add(8);
		ts.add(10);		
		
		System.out.println("hash set elements is:"+ts);
		LinkedHashSet<Integer>chs=new LinkedHashSet<Integer>();
		chs=(LinkedHashSet)ts.clone();
		System.out.println("cloned hash set elements is:"+chs);
	}

}
