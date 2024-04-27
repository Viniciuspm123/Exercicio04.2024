package tarefa04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o comprimento da caixa:");
        double comprimento = sc.nextDouble();

        System.out.println("Digite a largura da caixa:");
        double largura = sc.nextDouble();

        System.out.println("Digite a altura da caixa:");
        double altura = sc.nextDouble();

        // Calcula o volume da caixa
        double volume = comprimento * largura * altura;

        // Imprime o resultado
        System.out.println("O volume da caixa é: " + volume);
		

sc.close();		
	}

}
