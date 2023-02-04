package application;
import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
	
		
		System.out.println("Employee: ");
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Quantity Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee);

		System.out.println("Qual a porcentagem para acrescer no salário:");
		double percente = sc.nextDouble();
		employee.increaseSalary(percente);
		System.out.println("Employee: " + employee);

		sc.close();	

	}

}
