package day7;

import java.util.Iterator;
import java.util.Vector;
import java.util.*;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> v = new ArrayList<String>();
		v.add("hello");
		v.add("hi");
		v.add("bye");
		Iterator vi = v.iterator();
		while(vi.hasNext()) {
			System.out.println(vi.next()+"");
		}
		
	}
	}


