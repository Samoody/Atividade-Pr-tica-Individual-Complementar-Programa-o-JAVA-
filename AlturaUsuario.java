/*
 * RA: 12123150
 * AUTOR: SAMUEL KLEBER VIEIRA SILVA
 * DATA: 23/04/2025
 * 
 * Descrição: Programa que solicita a altura do usuário e apresenta uma mensagem bem-humorada sobre o valor.
 */

import java.util.Scanner;

public class AlturaUsuario {
    public static void main(String[] args) {
        // Criando o objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando a altura do usuário
        System.out.print("Por favor, informe sua altura em metros (ex: 1.75): ");
        double altura = scanner.nextDouble();

        // Exibindo a altura com uma mensagem bem-humorada
        System.out.print("Uau, você tem " + altura + " metros de pura estatura! Espero que você esteja alcançando as estrelas! 🌟");

        // Fechando o Scanner
        scanner.close();
    }
}
