package file;
import java.io.File;

public class fileexit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f= new File("a.txt");           
		if(f.delete())                      
		{  
		System.out.println(f.getName() + " deleted");     
		}  
		else  
		{  
		System.out.println("no file");  
		}  
		
	}

}
