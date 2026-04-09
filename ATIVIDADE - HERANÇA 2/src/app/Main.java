package app;

import formas.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Forma> formas = new ArrayList<>();

        formas.add(new Circulo(5));
        formas.add(new Triangulo(6, 4, 3, 4, 5));
        formas.add(new Retangulo(5, 3));
        formas.add(new Quadrado(4));

        for (Forma forma : formas) {
            forma.exibirInformacoes();
        }
    }
}