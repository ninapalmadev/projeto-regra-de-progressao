package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {
  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar: ");
    int qtdAtividades = scanner.nextInt();

    String[] atividades = new String[qtdAtividades];
    int[] pesos = new int[qtdAtividades];
    int[] notas = new int[qtdAtividades];

    for (int i = 0; i < qtdAtividades; i += 1) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ": ");
      scanner.nextLine();
      atividades[i] = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + (i + 1) + ": ");
      pesos[i] = scanner.nextInt();
      System.out.println("Digite a nota obtida para " + atividades[i] + ": ");
      notas[i] = scanner.nextInt();
    }

    int total = 0;
    for (int somaPeso : pesos) {
      total += somaPeso;
    }
    if (total != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }
    double somaNotas = 0;
    double somaPesos = 0;

    for (int i = 0; i < notas.length; i++) {
      somaNotas += notas[i] * pesos[i];
      somaPesos += pesos[i];
    }

    double resultado = somaNotas / somaPesos;

    if (resultado >= 85) {
      System.out.println("Parabéns! Você alcançou " + resultado + "%! E "
          + "temos o prazer de informar que você obteve aprovação");
    } else {
      System.out.println("Lamentamos informar que, com base na sua "
          + "pontuação alcançada neste período, " + resultado + "%, você não "
          + "atingiu a pontuação mínima necessária para sua aprovação.");
    }
    scanner.close();
  }
}