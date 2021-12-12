package assignment2;

public class Permanent_Employee extends Employee{
	private Double monthlySalary;
	private Double pf;
	private Double tax;

	Permanent_Employee(String employeeId, String employeeName, String departament, Double monthlySalary) {
		super(employeeId, employeeName, departament);
		this.monthlySalary = monthlySalary;
		this.pf = monthlySalary * 0.15;
		this.tax = calculateTax();
	}

	public Double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(Double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public Double getPf() {
		return pf;
	}

	public void setPf(Double pf) {
		this.pf = pf;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	@Override
	double calculateTax(){
		return monthlySalary * 0.1;
	}
	
	@Override
	public String toString() {
		return String.format("%-15s %-15s", monthlySalary, pf);	
	}

}
