package animais.especies;

import animais.tipos.Ave;

public class Calopsita extends Ave {
    public Calopsita(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("Assobio");
    }
}