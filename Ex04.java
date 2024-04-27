package tarefa04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//	Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em dólar.
		//	O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares disponível com o usuário,
		// para que seja apresentado o valor em moeda brasileira.
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a cotação do Dolar: ");
		double cotacaoDolar = sc.nextDouble();
		
		System.out.println("Digite a quantidade de dolares disponíveis: ");
		double qtdDolares = sc.nextDouble();
		
		double valorReais = qtdDolares*cotacaoDolar;
		
		System.out.println(" Valor em reais é: R$ " + valorReais);
		
		sc.close();

	}

}
