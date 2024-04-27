package tarefa04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a cotação do Dolar: ");
		double cotacaoDolar = sc.nextDouble();
		
		System.out.println("Digite a quantidade de reais disponíveis: ");
		double qtdReais = sc.nextDouble();
		
		double valorDolar = qtdReais/cotacaoDolar;
		
		System.out.println(" Valor em reais é: R$ " + valorDolar);
		
		sc.close();

	}

}
