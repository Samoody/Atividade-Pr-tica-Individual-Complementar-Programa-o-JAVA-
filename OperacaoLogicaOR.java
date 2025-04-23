/*
 * RA: 12123150
 * AUTOR: SAMUEL KLEBER VIEIRA SILVA
 * DATA: 23/04/2025
 * 
 * Descrição: Programa que solicita dois valores booleanos ao usuário, realiza a operação lógica OR e exibe o resultado.
 */

import java.util.Scanner;

public class OperacaoLogicaOR {
    public static void main(String[] args) {
        // Criando o objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando os dois valores booleanos
        System.out.print("Digite o primeiro valor booleano (true/false): ");
        boolean valor1 = scanner.nextBoolean();

        System.out.print("Digite o segundo valor booleano (true/false): ");
        boolean valor2 = scanner.nextBoolean();

        // Realizando a operação lógica OR
        boolean resultado = valor1 || valor2;

        // Exibindo o resultado da operação OR
        System.out.println("O resultado da operação OR entre os dois valores é: " + resultado);

        // Fechando o Scanner
        scanner.close();
    }
}
