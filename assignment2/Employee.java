package assignment2;

public class Employee implements Comparable<Employee> {
	private String employeeId;
	private String employeeName;
	private String departament;
	
	public Employee(String employeeId, String employeeName, String departament){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.departament = departament;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartament() {
		return departament;
	}
	public void setDepartament(String departament) {
		this.departament = departament;
	}
	
	double calculateTax() {
		return 0;
	}
	
	@Override
	public String toString() {
		return String.format("%-10s %-20s %-15s", employeeId, employeeName, departament);	
	}

	@Override
	public int compareTo(Employee other) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
