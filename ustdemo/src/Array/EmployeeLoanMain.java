package Array;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Scanner;
import java.text.DecimalFormat;



class Employee1{
	private String empId;
	private String empName;
	private double salary;

	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
class EmployeeUtility {

	public Employee1[] getEmployeeDetails(String[] details) {


       
       Employee1 ob[] =new Employee1[details.length];
       
       for(int i=0;i<details.length;i++){
           
           String x[] =details[i].split(";");
           
           Employee1 o=new Employee1();
           o.setEmpId(x[0]);
           o.setEmpName(x[1]);
           o.setSalary(Double.parseDouble(x[2]));
           
           ob[i]=o;
           
       }
       
       return ob;
       
	}

	public Stream<Employee1> getStreamOfEmployee1(Employee1[] empDetails) {

		
        Stream<Employee1> s=Arrays.stream(empDetails);
        return s;
         
	}

	public String[] shortlistedEmployee1(Stream<Employee1> empStream,double minSalary) {

		
        
        ArrayList<String> name=new ArrayList<>();
        
        empStream.forEach(a->{
            
           if(a.getSalary()>=minSalary){
               
               DecimalFormat df=new DecimalFormat("#.0");
               String sal=df.format(a.getSalary());
               
               name.add(a.getEmpId()+" "+a.getEmpName()+" "+sal);
           } 
            
            
            
        });

            
            String x[]=new String[name.size()];
            for(int i=0;i<x.length;i++){
                x[i]=name.get(i);
            }
            Arrays.sort(x);
            return x;



	}

}


public class EmployeeLoanMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeUtility utilObj=new EmployeeUtility();
		System.out.println("Enter the number of Employees");
		int n=sc.nextInt();
		sc.nextLine();
		if(n>0) {
			System.out.println("Enter the details of Employees");
			String [] details=new String[n];
			for(int i=0;i<n;i++) {
				details[i]=sc.nextLine();
			}
			System.out.println("Enter the minimum eligible salary");
			double minSalary=sc.nextDouble();

			String[] result=utilObj.shortlistedEmployee1(utilObj.getStreamOfEmployee1(utilObj.getEmployeeDetails(details)),minSalary);
			if(result.length>0)	{
				System.out.println("Shortlisted Employees are");
				for(String s:result) {
					System.out.println(s);
				}
			}
			else {
				System.out.println("No Employee is having the required salary");
			}
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}
