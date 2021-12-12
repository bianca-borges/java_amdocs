package assignment2;

public class Contract_Employee extends Employee{
	private Integer contractPeriod;
	private Double contractAmount;
	private Double tax;
	
	public Contract_Employee(String employeeId, String employeeName, String departament, Integer contractPeriod, Double contractAmount) {
		super(employeeId, employeeName, departament);
		this.contractPeriod = contractPeriod;
		this.contractAmount = contractAmount;
		this.tax = calculateTax();
	}
	
	public Integer getContractPeriod() {
		return contractPeriod;
	}
	public void setContractPeriod(Integer contractPeriod) {
		this.contractPeriod = contractPeriod;
	}
	public Double getContarctAmount() {
		return contractAmount;
	}
	public void setContarctAmount(Double contractAmount) {
		this.contractAmount = contractAmount;
	}
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	@Override
	double calculateTax() {
		return contractAmount * tax;
	}
	
	@Override
	public String toString() {
		return String.format("%-15s %-15s", contractPeriod, contractAmount);	
	}
	
	
}
