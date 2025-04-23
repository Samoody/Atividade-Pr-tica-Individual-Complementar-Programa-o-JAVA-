/*
 * RA: 12123150
 * AUTOR: SAMUEL KLEBER VIEIRA SILVA
 * DATA: 23/04/2025
 * 
 * Descrição: Programa que solicita ao usuário um número inteiro e um número real, soma-os e exibe o resultado.
 */

import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        // Criando o objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();

        // Solicitando um número real
        System.out.print("Digite um número real: ");
        double numeroReal = scanner.nextDouble();

        // Somando os dois números
        double soma = numeroInteiro + numeroReal;

        // Exibindo o resultado da soma
        System.out.println("A soma dos dois números é: " + soma);

        // Fechando o Scanner
        scanner.close();
    }
}
