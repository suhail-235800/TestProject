package Array;
abstract class Employee{
	protected int employeeid;
	protected String employeeName;
	protected double salary;
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		
		this.salary = salary;
	}
	public Employee(int employeeId,String employeeName){
		this.employeeid=employeeId;
		this.employeeName=employeeName;
	}
	public abstract void calculateSalary();
}

class PermanentEmployee extends Employee{
	
	PermanentEmployee(int employeeId, String employeeName,double basicPay) {
		super(employeeId, employeeName);
		this.basicPay=basicPay;
		
	}

	private double basicPay;

	public double getBasicPay() {
		
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	@Override
	public void calculateSalary() {
	
		double pfAmount = basicPay * 0.12;
		double salary = basicPay - pfAmount;
		setSalary(salary);
	}
	
}

class TemporaryEmployee extends Employee{
	
	private int hoursWorked;
	private int hourlyWages;
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHourlyWages() {
		return hourlyWages;
	}
	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	
	TemporaryEmployee(int employeeId, String employeeName,int hoursWorked,int hourlyWages){
		super(employeeId,employeeName);
		this.hourlyWages=hourlyWages;
		this.hoursWorked=hoursWorked;
		
		
	}
	@Override
	public void calculateSalary() {
		
		double salary=hoursWorked*hourlyWages;
		setSalary(salary);
		
	}
	
}

class Loan{
	public double calculateLoanAmount(Employee employeeObj) {
		double loan=0.0;
		
		if(employeeObj instanceof PermanentEmployee) {
			loan=employeeObj.getSalary()*.15;

		}
		else if(employeeObj instanceof TemporaryEmployee) {
			loan=employeeObj.getSalary()*.10;

		}
		return loan;
	}
}

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PermanentEmployee permanentemployee = new PermanentEmployee(101,"suhail",22000.0);
		TemporaryEmployee temporaryemployee = new TemporaryEmployee(102,"nivya",6,1000);
		
		permanentemployee.calculateSalary();
		temporaryemployee.calculateSalary();
		
		
		Loan loan=new Loan();
		
		double permanentEmployeeLoan = loan.calculateLoanAmount(permanentemployee);
		double temporaryEmployeeLoan = loan.calculateLoanAmount(temporaryemployee);
		
		System.out.println("Permanent Employee Salary:"+permanentemployee.getSalary());
		System.out.println("permanent employee loan:"+permanentEmployeeLoan);
		
		System.out.println();
		
		System.out.println("temporary Employee Salary:"+temporaryemployee.getSalary());
		System.out.println("temporary employee loan:"+temporaryEmployeeLoan);
		
	}

}
