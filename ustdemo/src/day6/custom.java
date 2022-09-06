package day6;

class Myexception extends Exception{
    

	
}
public class custom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
    try  
    {  
        
        throw new Myexception();  
    }  
    catch (Myexception e)  
    {  
        System.out.println("Caught the exception");  
        System.out.println(e);
    }  

}  

}
