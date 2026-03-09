#include <stdio.h>

int main() {

    int i = 0;

    while (i < 10) {
        printf("while: %d\n", i);
        i++;
    }

    do {
        printf("do: %d\n", i);
        i++;
    } while (i < 10);

    return 0;
}

/*
a) A saída será uma sequência de números de 0 a 10.

b) while: Testa a condição antes de executar o bloco. Se a condição for falsa de primeira, o código dentro dele nunca é executado.
   do..while: Executa o bloco pelo menos uma vez e só depois testa a condição para decidir se repete.

c) Para substituir o primeiro bloco do código (while), a sintaxe do for condensa a inicialização, a condição e o incremento em uma única linha:

   for (int i = 0; i < 10; i++) {
        printf("for: %d\n", i);
}

d) for: Quando você sabe exatamente quantas vezes o loop deve rodar.
   while: Quando o número de repetições é incerto e depende de uma condição que pode mudar a qualquer momento.

*/