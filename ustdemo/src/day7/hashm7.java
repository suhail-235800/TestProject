package day7;

import java.util.HashMap;
import java.util.Scanner;

public class hashm7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k;
		HashMap <Integer,String> map = new HashMap<>();
		map.put(1,"red");
		map.put(2, "green");
		map.put(3, "blue");
		System.out.println("enter the key" );
		Scanner in = new Scanner(System.in);
		k=in.nextInt();
		System.out.println(map.containsKey(k));
			
		
	}

}
