/*
 * RA: 12123150
 * AUTOR: SAMUEL KLEBER VIEIRA SILVA
 * DATA: 23/04/2025
 * 
 * Descrição: Programa que solicita o sonho ou objetivo profissional do usuário e exibe uma mensagem de incentivo.
 */

import java.util.Scanner;

public class PlanejamentoDeFuturo {
    public static void main(String[] args) {
        // Criando o objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando o sonho ou objetivo profissional do usuário
        System.out.print("Qual é o seu sonho ou objetivo profissional? ");
        String objetivo = scanner.nextLine();

        // Exibindo o texto com palavras de incentivo
        System.out.println("Que incrível! Seu objetivo de se tornar " + objetivo + " é sensacional!");
        System.out.println("Continue firme e acredite no seu potencial. O futuro é seu!");

        // Fechando o Scanner
        scanner.close();
    }
}
