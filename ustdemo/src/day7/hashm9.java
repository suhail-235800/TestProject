package day7;

import java.util.HashMap;
import java.util.*;

public class hashm9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k;
		HashMap <Integer,String> map = new HashMap<>();
		map.put(1,"red");
		map.put(2, "green");
		map.put(3, "blue");
		System.out.println(map);
		Set set = map.entrySet();
		System.out.println("set values"+set);
		
		
	}

}
