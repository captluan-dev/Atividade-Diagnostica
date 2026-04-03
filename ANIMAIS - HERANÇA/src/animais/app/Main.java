package animais.app;

import animais.base.*;
import animais.especies.*;

public class Main {
    public static void main(String[] args) {

        Animal[] animais = {
            new Cachorro("Rex", 5),
            new Gato("Mimi", 3),
            new Tartaruga("Tuga", 10),
            new Iguana("Iggy", 4),
            new Galinha("Lola", 2),
            new Calopsita("Piu", 1),
            new Pardal("Zeca", 2),
            new Arara("Azul", 6)
        };

        for (Animal a : animais) {
            a.exibirInfo();
            a.emitirSom();
            System.out.println("-----");
        }
    }
}