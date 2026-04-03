package animais.especies;

import animais.tipos.Ave;

public class Arara extends Ave {
    public Arara(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("Grito de arara");
    }
}