package org.example.ex06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Ler dois números inteiros e exibir o quociente e o resto da divisão inteira entre eles.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numeroA = sc.nextInt();
        System.out.println("Digite outro numero inteiro: ");
        int numeroB = sc.nextInt();

        System.out.println("Quociente da divisao: " + (double) numeroA / numeroB);
        System.out.println("Resto da divisao: " + numeroA % numeroB);

    }
}
