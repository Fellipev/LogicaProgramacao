package org.example.ex01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Dado o tamanho da base e da altura de um retângulo, calcular a sua área e o seu
        //perímetro.

        Scanner sc = new Scanner(System.in);
        System.out.println("Declare o tamanho da base do retângulo: ");
        double base = sc.nextDouble();
        System.out.println("Declare a altura do retângulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("Area do retângulo: " + area);
        System.out.println("Perimetro do retângulo: " + perimetro);
    }
}
