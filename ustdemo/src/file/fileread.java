package file;

import java.util.Scanner;
import java.io.File;

public class fileread {
	
	public static void main(String[] args) {
		
		try {
			
			File f1 = new File("a.txt");
			Scanner in = new Scanner(f1);
			while(in.hasNextLine()) {
				String data = in.nextLine();
				System.out.println(data);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
