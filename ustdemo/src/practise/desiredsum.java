package practise;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class desiredsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int n,l,f=0;
		System.out.println("enter no of elements in the array");
		l=in.nextInt();
		int a[]=new int[l];
		System.out.println();
		System.out.println("enter the elements");
		for(int i=0;i<l;i++) {
			a[i]=in.nextInt();
		}
		System.out.println("Enter the desired sum");
		n=in.nextInt();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if((a[i]+a[j])==n) {
					
					if(!(map.containsValue(a[i])))
						map.put(a[i], a[j]);}
				}
			}
		
			
		for(Entry<Integer, Integer> m : map.entrySet()){    
			    System.out.println("("+m.getKey()+","+m.getValue()+")");    
			   }  
		
	}

}
