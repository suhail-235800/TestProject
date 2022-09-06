package file;
import java.util.Scanner;
import java.io.FileWriter;

public class filewrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			
			FileWriter fw = new FileWriter("a.txt");
			fw.write("Hello");
			fw.write("Files");
			fw.close();
		}catch (Exception e){
			System.out.println(e);
		}
		
	}

}
