package org.example.ex05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Ler um número inteiro e exibir o seu sucessor

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        System.out.println("Sucessor de " + numero + " é " + (numero + 1));
    }
}
