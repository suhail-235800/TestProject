package day6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data,pos;
		LinkedList <Integer> list = new LinkedList <Integer>();
		Scanner in = new Scanner(System.in);
		System.out.println("enter the elements to the linked list");
		for(int i =0;i<4;i++) {
			data=in.nextInt();
			list.add(data);
		}
		System.out.println("Enter the position:");
		pos=in.nextInt();
		ListIterator it = list.listIterator(pos-1);
		System.out.println("Elements from position"+pos+":");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}