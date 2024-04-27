package tarefa04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//	3) Ler dois inteiros (variáveis A e B)
		//	e imprimir o resultado do quadrado da diferença do primeiro valor pelo segundo.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A : ");
		int valorA = sc.nextInt();
		
		System.out.println("Digite o valor de B: ");
		int valorB = sc.nextInt();
		
		int diferenca = valorA-valorB;
		
		int diferencaQuadrado = diferenca*diferenca;
		
		System.out.println("O quadrado da diferença entre A e B é: " + diferencaQuadrado);
		
sc.close();
	}

}
