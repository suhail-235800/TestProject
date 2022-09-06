package file;
import java.io.File;

public class file1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f1 = new File("a.txt");
		try {
			boolean success=f1.createNewFile();
			if(success) {
				System.out.println("Created");
			}
			else {
				System.out.println("Already exists");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
