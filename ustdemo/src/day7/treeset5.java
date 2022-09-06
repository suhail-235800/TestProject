package day7;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(1);
		ts.add(4);
		ts.add(5);
		ts.add(8);
		ts.add(10);

		for(int e:ts) {
			if(e<7) {
				System.out.println(e);
			}
		}
		
	}		
		


}
