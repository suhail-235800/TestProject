package day6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class java5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data,pos,newdata;
		LinkedList <Integer> list = new LinkedList <Integer>();
		Scanner in = new Scanner(System.in);
		System.out.println("enter the elements to the linked list");
		for(int i =0;i<4;i++) {
			data=in.nextInt();
			list.add(data);
		}
		System.out.println("enter the new element:");
		newdata = in.nextInt();
		
		System.out.println("Enter the position:");
		pos=in.nextInt();
		list.add(pos-1,newdata);
		System.out.println("the new linked list:");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+"");
		}

		}
}


