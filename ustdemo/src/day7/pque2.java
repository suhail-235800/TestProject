package day7;

import java.util.*;

public class pque2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s;
		PriorityQueue<String> p = new PriorityQueue<String>();
		p.add("green");
		p.add("red");
		p.add("blue");
		System.out.println("enter the string");
		Scanner in = new Scanner(System.in);
		s=in.nextLine();
		p.add(s);
		System.out.println(p);
		
		
	}

}
