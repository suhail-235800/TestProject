package day6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class java11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data,newdata,c=0;
		LinkedList <Integer> list = new LinkedList <Integer>();
		Scanner in = new Scanner(System.in);
		System.out.println("enter the elements to the linked list");
		for(int i=0;i<4;i++) {
			data=in.nextInt();
			list.add(data);
		}
		System.out.println("enter the element to be deleted:");
		newdata = in.nextInt();
		ListIterator itr = list.listIterator();

		while(itr.hasNext()) {
			if(list.get(c)==newdata) {
				list.remove(c-1);
				break;
			}
			itr.next();
			c++;
			
		}
		
		System.out.println("the new linked list:");
		ListIterator itr1 = list.listIterator();
		while(itr1.hasNext()) {
			System.out.println(itr.next()+"");
		}
	}

}
