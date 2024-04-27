package tarefa04;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Leitura da quantidade de votos válidos para cada candidato
        System.out.print("Digite a quantidade de votos válidos para o candidato A: ");
        int votosA = sc.nextInt();

        System.out.print("Digite a quantidade de votos válidos para o candidato B: ");
        int votosB = sc.nextInt();

        System.out.print("Digite a quantidade de votos válidos para o candidato C: ");
        int votosC = sc.nextInt();

        // Leitura da quantidade de votos nulos e em branco
        System.out.print("Digite a quantidade de votos nulos: ");
        int votosNulos = sc.nextInt();

        System.out.print("Digite a quantidade de votos em branco: ");
        int votosBranco = sc.nextInt();

        // Cálculo do número total de eleitores
        int totalEleitores = votosA + votosB + votosC + votosNulos + votosBranco;

        // Cálculo dos percentuais
        double percentualVotosValidos = ((double) (votosA + votosB + votosC) / totalEleitores) * 100;
        double percentualVotosA = ((double) votosA / totalEleitores) * 100;
        double percentualVotosB = ((double) votosB / totalEleitores) * 100;
        double percentualVotosC = ((double) votosC / totalEleitores) * 100;
        double percentualVotosNulos = ((double) votosNulos / totalEleitores) * 100;
        double percentualVotosBranco = ((double) votosBranco / totalEleitores) * 100;

        // Apresentação dos resultados
        System.out.println("Número total de eleitores: " + totalEleitores);
        System.out.println("Percentual de votos válidos em relação à quantidade de eleitores: " + percentualVotosValidos + "%");
        System.out.println("Percentual de votos válidos do candidato A em relação à quantidade de eleitores: " + percentualVotosA + "%");
        System.out.println("Percentual de votos válidos do candidato B em relação à quantidade de eleitores: " + percentualVotosB + "%");
        System.out.println("Percentual de votos válidos do candidato C em relação à quantidade de eleitores: " + percentualVotosC + "%");
        System.out.println("Percentual de votos nulos em relação à quantidade de eleitores: " + percentualVotosNulos + "%");
        System.out.println("Percentual de votos em branco em relação à quantidade de eleitores: " + percentualVotosBranco + "%");
        
        sc.close();

	}

}
