/*
 * RA: 12123150
 * AUTOR: SAMUEL KLEBER VIEIRA SILVA
 * DATA: 23/04/2025
 * 
 * Descrição: Programa que solicita a inicial do nome do usuário e exibe a informação.
 */

import java.util.Scanner;

public class InicialDoNome {
    public static void main(String[] args) {
        // Criando o objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando a inicial do nome do usuário
        System.out.print("Digite a inicial do seu nome: ");
        char inicial = scanner.next().charAt(0);

        // Exibindo a inicial
        System.out.println("Sua inicial é " + inicial + ".");

        // Fechando o Scanner
        scanner.close();
    }
}
