package entities;

public class Employee {
		
	public String name;
	public double grossSalary;
	public double tax;
	public double percente;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	public void increaseSalary(double percente) {
		grossSalary = grossSalary % percente;
	}
	
	public String toString() {
		
		return  name +", $ "
				+ String.format("%.2f", grossSalary) 
				+ ", $" 
				+ String.format("%.2f", netSalary());
	}
}
