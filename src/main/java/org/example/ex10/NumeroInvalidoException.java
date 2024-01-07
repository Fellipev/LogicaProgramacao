package org.example.ex10;

public class NumeroInvalidoException extends Exception {

    private int numero;

    public NumeroInvalidoException(int valor) {
        this.numero = valor;
    }

    @Override
    public String getMessage() {
        return "O numero " + this.numero + " é inválido!";
    }
}
