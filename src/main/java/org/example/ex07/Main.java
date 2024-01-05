package org.example.ex07;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Solicitar a idade de uma pessoa em dias e informar na tela a idade em anos, meses e dias.

        Scanner sc = new Scanner(System.in);
//        Date now = new Date();
//        System.out.println(now.getMonth() + 1);
//        System.out.println(now);

        System.out.println("Digite sua idade em dias: ");
        int response = sc.nextInt();

        int anos = response / 365;
        int meses = anos * 30 * 12 / 365;

        System.out.println("idade: " + anos);
        System.out.println("Meses: " + meses);
    }
}
