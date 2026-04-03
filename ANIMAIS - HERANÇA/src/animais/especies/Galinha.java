package animais.especies;

import animais.tipos.Ave;

public class Galinha extends Ave {
    public Galinha(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("Cócó");
    }
}