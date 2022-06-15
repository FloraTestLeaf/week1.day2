package week1.day2;

//Assignment3:
		//Create a new class as EmployeeDetails with methods as below
//	printEmployeeName(String empName, int empId) -> print the empName & empId
//	getEmployeeAddress(String empAddress) -> print address (eg: Chennai)
//	printEmployeeSalary(double empSalary) -> print the empSalary
//	printEmployeeMobileNumber(long mobNum) -> print the phoneNumber
//	Call all the methods from main() and execute


public class EmployeeDetails {
	
	public String printEmployeeName() {
		String name="FlorGrace";
		return name ;
	}
	
  public int employeeId() {
	  int id=54;
	  return id;
  }
  
  public String getEmployeeAddress() {
	  String address="Chennai";
	  return address;
  }
  
  public double employeeSalary() {
	  double salary=25000;
	  return salary;
  }
  
  public long employeeMobNum() {
	  long mobNum=8754788899l;
	  return mobNum;
  }
	
  public static void main(String args[]) {
	  EmployeeDetails em=new EmployeeDetails();
	  System.out.println(em.printEmployeeName());
	  System.out.println(em.employeeId());
	  System.out.println(em.getEmployeeAddress());
	  System.out.println(em.employeeSalary());
	  System.out.println(em.employeeMobNum());
  }
	
	
}
