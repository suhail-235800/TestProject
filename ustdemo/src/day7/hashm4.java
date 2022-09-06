package day7;

import java.util.HashMap;

public class hashm4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <Integer,String> map = new HashMap<>();
		map.put(1,"red");
		map.put(2, "green");
		map.put(3, "blue");
		System.out.println(map);
		map.clear();
		System.out.println(map);
}
}