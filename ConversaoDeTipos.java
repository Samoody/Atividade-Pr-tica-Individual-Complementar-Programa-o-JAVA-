/*
 * RA: 12123150
 * AUTOR: SAMUEL KLEBER VIEIRA SILVA
 * DATA: 23/04/2025
 * 
 * Descrição: Programa que solicita um número inteiro do usuário, converte para double e exibe o resultado formatado.
 */

import java.util.Scanner;

public class ConversaoDeTipos {
    public static void main(String[] args) {
        // Criando o objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando um número inteiro ao usuário
        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();

        // Convertendo para double (conversão implícita)
        double numeroDouble = numeroInteiro;

        // Exibindo o resultado formatado com System.out.printf
        System.out.printf("O número em formato double é: %.1f%n", numeroDouble);

        // Fechando o Scanner
        scanner.close();
    }
}
