package animais.especies;

import animais.tipos.Mamifero;

public class Gato extends Mamifero {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("Miau");
    }
}