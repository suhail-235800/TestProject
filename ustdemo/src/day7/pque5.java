package day7;
import java.util.*;
import java.util.PriorityQueue;

public class pque5 {

	public static void main(String[] args) {
		PriorityQueue<String> p = new PriorityQueue<String>();
		p.add("green");
		p.add("red");
		p.add("blue");
		System.out.println("the que elements are "+p);
		System.out.println("the first element is "+p.peek());

	}

}
