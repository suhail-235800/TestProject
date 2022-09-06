package day6;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.io.*;

public class java4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data;
		LinkedList <Integer> list = new LinkedList <Integer>();
		Scanner in = new Scanner(System.in);
		System.out.println("enter the elements to the linked list");
		for(int i =0;i<4;i++) {
			data=in.nextInt();
			list.add(data);
		}
		Collections.reverse(list);
		ListIterator it =list.listIterator();
		System.out.println("after reversing");
		while(it.hasNext()) {
			System.out.println(""+it.next()+"");
		}
	}

}
