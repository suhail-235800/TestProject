package day6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class java10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data,pos,newdata,c=0,pi=0;
		LinkedList <Integer> list = new LinkedList <Integer>();
		Scanner in = new Scanner(System.in);
		System.out.println("enter the elements to the linked list");
		for(int i=0;i<4;i++) {
			data=in.nextInt();
			list.add(data);
		}
		System.out.println("enter the element to be searched:");
		newdata = in.nextInt();
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
				if(list.get(c)==newdata) {
					System.out.println("first occurence"+c);
					break;
				}
				itr.next();
				c++;
				
			}
		c=0;
		while(itr.hasNext()) {
			if(list.get(c)==newdata) {
				
				pi=c;
				
			}
			itr.next();
			c++;
			
		}
		System.out.println("Last occurence is"+pi);
		}
		
	
}
