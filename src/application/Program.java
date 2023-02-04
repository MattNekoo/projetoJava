package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity Stock: ");
		int quantity = sc.nextInt();
		Product product = new Product(name, price, quantity);
		
		/* Example setName */ 
		// product.setName("Monitor");
		
		System.out.println("Product data: " + product);
		
		System.out.println("Adicione os produtos no estoque:");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println("Product data: " + product);
		
		System.out.println("Delete os produtos:");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("Product data: " + product);

		sc.close();
	}

}
