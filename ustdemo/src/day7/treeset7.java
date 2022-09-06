package day7;

import java.util.*;

public class treeset7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <Integer> s = new HashSet<Integer>();
	
		Set<Integer> s2 = new HashSet<Integer>();
		Integer[] a = {22,23,24,25,26};
		s.addAll(Arrays.asList(a));
		System.out.println(s);
		Integer[] b = {22,23,23,24,25,26,12,14};
		s2.addAll(Arrays.asList(b));
		System.out.println(s2);
		System.out.println("the common element is");
		Set <Integer> sn = new HashSet(s);
		sn.retainAll(s2);
		System.out.println(sn);
		
	}

}
