/*
 * RA: 12123150
 * AUTOR: SAMUEL KLEBER VIEIRA SILVA
 * DATA: 22/04/2025
 * Descrição: Programa que solicita o nome do usuário e exibe uma saudação personalizada.
 */

import java.util.Scanner;

public class FaleSobreVoce {
    public static void main(String[] args) {
        // Criando o objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando o nome do usuário
        System.out.print("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();

        // Exibindo a saudação
        System.out.println("Olá, " + nome + "! Seja bem-vindo(a)!");
        
        // Fechando o Scanner
        scanner.close();
    }
}
