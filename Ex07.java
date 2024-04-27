package tarefa04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Valor de A: ");
		double valorA = sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		double valorB = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		double valorC = sc.nextDouble();
		
		
		double soma = valorA+valorB+valorC;
		double quadradoSoma = soma*soma;
		
		System.out.println("O quadrados da soma de A, B e C é: " + quadradoSoma);
				
		
sc.close();	
		
		

	}

}
