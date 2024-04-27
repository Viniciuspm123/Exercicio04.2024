package tarefa04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do seu salario mensal : ");
		double salarioMensal = sc.nextDouble();
		System.out.println("Digite o valor do percentual");
		double reajuste = sc.nextDouble();
		
		double novoSalario = salarioMensal*(1+reajuste/100);
		
		System.out.println("O novo salário vai ser de R$: "+novoSalario);
		
		
sc.close();
	}

}
