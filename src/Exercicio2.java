import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int peca1, peca2;
		int cod1, cod2;
		double valor1, valor2;
		double total;
		
		cod1 = sc.nextInt();
		peca1 = sc.nextInt();
		valor1 = sc.nextDouble();
		cod2 = sc.nextInt();
		peca2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		total = ((int)peca1 * valor1) + ((int)peca2 * valor2);
		
		
		System.out.printf("Valor a pagar = U$%.2f" , total);
		
		sc.close();
	}

}
