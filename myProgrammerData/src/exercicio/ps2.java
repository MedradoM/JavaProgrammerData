package exercicio;

import java.util.Scanner;

public class ps2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] gastos = new int[10][12];
		
		System.out.println("--------------------------------------");
		System.out.println("Digite os valores dos anos:");
		for (int i = 0; i < 10; i++) {
            System.out.printf("Gastos do ano %d:%n", i + 1);
            for (int j = 0; j < 12; j++) {
                System.out.printf("Mês %d: ", j + 1);
                gastos[i][j] = sc.nextInt();
            }
            System.out.println();
        }
		
        double[] mediasMensais = new double[12];
        for (int j = 0; j < 12; j++) {
            int soma = 0;
            for (int i = 0; i < 10; i++) {
                soma += gastos[i][j];
            }
            mediasMensais[j] = soma / 10.0;
        }
		
        int mesMax = 0;
        int anoMax = 0;
        int maxGasto = gastos[0][0];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                if (gastos[i][j] > maxGasto) {
                    maxGasto = gastos[i][j];
                    mesMax = j + 1;
                    anoMax = i + 1;
                }
            }
        }
		
        System.out.println("Média de gastos mensais:");
        for (int j = 0; j < 12; j++) {
            System.out.printf("Mês %d: R$ %.2f%n", j + 1, mediasMensais[j]);
        }
        System.out.printf("Maior gasto: R$ %d, no mês %d do ano %d%n", maxGasto, mesMax, anoMax);

        sc.close();
	}

}

