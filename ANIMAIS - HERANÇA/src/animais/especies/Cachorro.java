package animais.especies;

import animais.tipos.Mamifero;

public class Cachorro extends Mamifero {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("Latido");
    }
}