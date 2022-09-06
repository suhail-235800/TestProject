package day7;

import java.util.HashMap;
import java.util.*;

public class hashm10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k;
		HashMap <Integer,String> map = new HashMap<>();
		map.put(1,"red");
		map.put(2, "green");
		map.put(3, "blue");
		System.out.println(map);
		System.out.println("enter key");
		Scanner in = new Scanner(System.in);
		k = in.nextInt();
		String val = (String)map.get(k);
		System.out.println("value of "+k+" is:"+val);
	}

}
