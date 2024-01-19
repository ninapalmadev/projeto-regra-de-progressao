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

    for (int i = 0; i < qtdAtividades; i += 1) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ": ");
      scanner.nextLine();
      atividades[i] = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + (i + 1) + ": ");
      pesos[i] = scanner.nextInt();
    }
    scanner.close();
  }
}