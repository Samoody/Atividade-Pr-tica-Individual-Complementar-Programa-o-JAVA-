/*
 * RA: 12123150
 * AUTOR: SAMUEL KLEBER VIEIRA SILVA
 * DATA: 23/04/2025
 * 
 * Descrição: Programa que solicita três notas do usuário e calcula a média, exibindo com uma casa decimal.
 */

import java.util.Scanner;

public class MediaDasNotas {
    public static void main(String[] args) {
        // Criando o objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando as três notas do usuário
        System.out.print("Digite a primeira nota: ");
        float nota1 = scanner.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nota2 = scanner.nextFloat();
        System.out.print("Digite a terceira nota: ");
        float nota3 = scanner.nextFloat();

        // Calculando a média
        float media = (nota1 + nota2 + nota3) / 3;

        // Exibindo a média formatada com uma casa decimal
        System.out.printf("A média das suas notas é: %.1f%n", media);

        // Fechando o Scanner
        scanner.close();
    }
}
