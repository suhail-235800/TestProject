package ustdemo;

public class onezerostar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=4;i>0;i--) {
			int c=i;
			while(4-c!=0) {
				System.out.print(" ");
				c++;
			}
			for(int j=i;j>1;j--) {
				System.out.print(1);
				System.out.print(0);
			}
			System.out.print(1);
			System.out.println(" ");
		}

	}


}