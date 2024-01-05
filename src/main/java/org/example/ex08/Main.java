package org.example.ex08;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Dado que a fórmula para conversão de Fahrenheit para Celsius é C = 5/9 (F – 32), leu um
        //valor de temperatura em Fahrenheit e exibi-lo em Celsius

        Scanner sc = new Scanner(System.in);
        System.out.println("Declare uma temperatura em Fahrenheit: ");
        double fah = sc.nextDouble();

        double celsius = (fah - 32) * 5 / 9;
        System.out.println("Graus em Celsius: " + celsius);
    }
}
