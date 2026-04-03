package animais.especies;

import animais.tipos.Reptil;

public class Tartaruga extends Reptil {
    public Tartaruga(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("Som de tartaruga");
    }
}