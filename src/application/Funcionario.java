package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Funcionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Employee: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		double grossSalary = sc.nextDouble();
		
		System.out.println("Quantity Tax: ");
		double tax = sc.nextDouble();
		
		Employee employee = new Employee(name, grossSalary, tax);
	
		System.out.println("Employee: " + employee);

		System.out.println("Qual a porcentagem para acrescer no salário:");
		double percente = sc.nextDouble();
		employee.increaseSalary(percente);
		System.out.println("Employee: " + employee);

		sc.close();	

	}

}
