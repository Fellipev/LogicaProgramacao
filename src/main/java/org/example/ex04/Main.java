package org.example.ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Dado os três lados de um triângulo determinar o perímetro do mesmo
        Scanner sc = new Scanner(System.in);
        System.out.println("Declare o primeiro lado de um triangulo: ");
        double lado1 = sc.nextDouble();
        System.out.println("Declare o segundo lado de um triangulo: ");
        double lado2 = sc.nextDouble();
        System.out.println("Declare o terceiro lado de um triangulo: ");
        double lado3 = sc.nextDouble();

        double perimetro = calcPerimetro(lado1, lado2, lado3);
        System.out.println("Perimetro: " + perimetro);

    }

    public static double calcPerimetro(double ladoA, double ladoB, double ladoC) {

        return (ladoA + ladoB + ladoC);
    }
}
