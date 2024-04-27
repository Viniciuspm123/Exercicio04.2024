package tarefa04;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		int valorA= sc.nextInt();
		System.out.println("Digite o valor de B: ");
		int valorB= sc.nextInt();
		System.out.println("Digite o valor de C: ");
		int valorC= sc.nextInt();
		System.out.println("Digite o valor de D: ");
		int valorD= sc.nextInt();
		
		int produto = valorA+valorC;
		int soma = valorB+valorD;		
		
		System.out.println("O produto A e C é : "+produto);
		System.out.println("A soma de B e D é : "+soma);
		
sc.close();
	}

}
