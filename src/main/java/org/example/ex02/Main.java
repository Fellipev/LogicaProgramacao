package org.example.ex02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Dado o tamanho do lado de um quadrado, calcular a área e o perímetro do mesmo
        Scanner sc = new Scanner(System.in);
        System.out.println("Declare o valor do lado de um quadrado: ");
        double lado = sc.nextDouble();

        double area = lado * lado;
        double perimetro = 4 * lado;

        System.out.println("Area do quadrado: " + area);
        System.out.println("Perimetro do quadrado: " + perimetro);
    }
}
