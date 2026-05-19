package org.example.erros;

public class NumeroForaDoEsperado extends RuntimeException {
    public NumeroForaDoEsperado(String message) {
        super(message);
    }
}
