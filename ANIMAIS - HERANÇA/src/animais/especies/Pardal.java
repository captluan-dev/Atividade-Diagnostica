package animais.especies;

import animais.tipos.Ave;

public class Pardal extends Ave {
    public Pardal(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("Piu piu");
    }
}