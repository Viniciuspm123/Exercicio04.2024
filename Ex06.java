package tarefa04;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Valor de A: ");
		double valorA = sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		double valorB = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		double valorC = sc.nextDouble();
		
		
		double soma = (valorA*valorA)+(valorB*valorB)+(valorC*valorC);
		
		System.out.println("A soma dos quadrados de A, B e C é: " + soma);
				
		
sc.close();		
	}

}
