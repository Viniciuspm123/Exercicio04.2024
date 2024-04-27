package tarefa04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quatros numeros inteiros:");
		
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		
		// OPERAÇÃO DE SOMA E MULTIPLICAÇÃO
		
		int somaAB = A + B;
		int somaAC = A + C;
		int somaAD = A + D;
		int somaBC = B + C;
		int somaBD = B + D;
		int somaCD = C + D;
		
		
		int multAB = A * B;
		int multAC = A * C;
		int multAD = A * D;
		int multBC = B * C;
		int multBD = B * D;
		int multCD = C * D;
		
		System.out.println("Resultados:");
        System.out.println("A + B = " + somaAB);
        System.out.println("A + C = " + somaAC);
        System.out.println("A + D = " + somaAD);
        System.out.println("B + C = " + somaBC);
        System.out.println("B + D = " + somaBD);
        System.out.println("C + D = " + somaCD);
        System.out.println("A * B = " + multAB);
        System.out.println("A * C = " + multAC);
        System.out.println("A * D = " + multAD);
        System.out.println("B * C = " + multBC);
        System.out.println("B * D = " + multBD);
        System.out.println("C * D = " + multCD);

sc.close();		
	}

}
