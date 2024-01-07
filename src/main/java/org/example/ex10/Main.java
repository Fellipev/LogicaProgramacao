package org.example.ex10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NumeroInvalidoException{
        //Converter um inteiro informado menor que 32 para sua representação em binário
        Scanner sc = new Scanner(System.in);

        System.out.println("Declare um inteiro menos que 32 e maior que 0: ");
        int inteiro = sc.nextInt();

        if(inteiro >= 32 || inteiro < 0) {
            throw new NumeroInvalidoException(inteiro);
        }

        String resposta = getBinar(inteiro);
        System.out.println(inteiro + " em binario = " + organizarResposta(resposta));
    }

    public static String getBinar(int inteiro) {

        String resposta = "";
        while(inteiro / 2 != 0) {

            resposta += inteiro % 2 + "";
            if(inteiro / 2 == 1) {
                resposta += inteiro / 2;
            }
            inteiro = inteiro / 2;
//            System.out.println("Resposta agora: " + resposta);
//            System.out.println("inteiro agora: " + inteiro);
        }

        return resposta;
    }

    public static String organizarResposta(String resposta) {
        String saida = "";

        for(int i = resposta.length() -1; i >= 0; i--) {
            saida += resposta.charAt(i);
        }

        return saida;
    }

}
