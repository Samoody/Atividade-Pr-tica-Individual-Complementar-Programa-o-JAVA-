/*
 * RA: 12123150
 * AUTOR: SAMUEL KLEBER VIEIRA SILVA
 * DATA: 23/04/2025
 * 
 * Descrição: Programa que solicita dois números decimais do usuário e exibe a soma com duas casas decimais.
 */

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        // Criando o objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando o primeiro número
        System.out.print("Digite o primeiro número decimal: ");
        double numero1 = scanner.nextDouble();

        // Solicitando o segundo número
        System.out.print("Digite o segundo número decimal: ");
        double numero2 = scanner.nextDouble();

        // Calculando a soma
        double soma = numero1 + numero2;

        // Exibindo o resultado formatado com duas casas decimais
        System.out.printf("A soma dos
