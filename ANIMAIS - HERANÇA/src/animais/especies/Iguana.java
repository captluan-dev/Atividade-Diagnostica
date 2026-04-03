package animais.especies;

import animais.tipos.Reptil;

public class Iguana extends Reptil {
    public Iguana(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("Som de iguana");
    }
}