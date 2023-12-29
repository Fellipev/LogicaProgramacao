package org.example.ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Dado o tamanho do raio de uma circunferência, calcular a área e o perímetro da mesma

        Scanner sc = new Scanner(System.in);

        System.out.println("Declare o tamanho do raio da circunferência: ");
        double raio = sc.nextDouble();

        double area = calcArea(raio);
        double perimetro = calcPerimetro(raio);

        System.out.println("Area da circunferência: " + area);
        System.out.println("Perimetro da circunferência: " + perimetro);

    }

    public static double calcArea(double raio) {

        double area = 3.14 * (raio * raio);
        return area;
    }

    public static double calcPerimetro(double raio) {

        double perimetro = 3.14 * (raio * 2);
        return perimetro;
    }
}
