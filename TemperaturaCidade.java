/*
 * RA: 12123150
 * AUTOR: SAMUEL KLEBER VIEIRA SILVA
 * DATA: 23/04/2025
 * 
 * Descrição: Programa que solicita a temperatura atual na cidade do usuário e exibe a temperatura.
 */

import java.util.Scanner;

public class TemperaturaCidade {
    public static void main(String[] args) {
        // Criando o objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Perguntando a temperatura atual na cidade do usuário
        System.out.print("Qual é a temperatura atual em sua cidade (em °C)? ");
        int temperatura = scanner.nextInt();

        // Exibindo a temperatura com a mensagem
        System.out.println("A temperatura em sua cidade é de " + temperatura + "°C.");

        // Fechando o Scanner
        scanner.close();
    }
}
