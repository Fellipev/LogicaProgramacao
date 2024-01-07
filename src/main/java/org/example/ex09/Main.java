package org.example.ex09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Faça um algoritmo que calcule e apresente o valor do volume de uma lata de óleo, dado
        //seu raio e sua altura.

        Scanner sc = new Scanner(System.in);
        System.out.println("Declare a altura da lata: ");
        double altura = sc.nextDouble();
        System.out.println("Declare o raio da lata: ");
        double raio = sc.nextDouble();

        double volume = 3.14 * (raio * raio) * altura;

        System.out.println("Volume da lata = " + volume + "cm³");
    }
}
