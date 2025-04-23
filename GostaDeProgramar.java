/*
 * RA: 12123150
 * AUTOR: SAMUEL KLEBER VIEIRA SILVA
 * DATA: 23/04/2025
  * Descrição: Programa que pergunta ao usuário se ele gosta de programar e exibe a resposta booleana com explicação.
 */

import java.util.Scanner;

public class GostaDeProgramar {
    public static void main(String[] args) {
        // Criando o objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Perguntando se o usuário gosta de programar
        System.out.print("Você gosta de programar? (true/false): ");
        boolean gostaDeProgramar = scanner.nextBoolean();

        // Exibindo a resposta e explicando com base no valor booleano
        System.out.print("Resposta recebida: " + gostaDeProgramar + ". ");
        if (gostaDeProgramar)
