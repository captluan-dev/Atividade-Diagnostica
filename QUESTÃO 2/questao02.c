#include <stdio.h>

int main() {

    int faltas;
    float nota;

    printf("Digite a nota do estudante: ");
    scanf("%f", &nota);
    printf("Digite a quantidade de faltas do estudante: ");
    scanf("%d", &faltas);

    if (nota >= 7.0 && faltas <= 5) {
        printf("\nO estudante foi aprovado!\n");
    } else if (nota >= 7.0 && faltas > 5) {
        printf("\nO estudante foi reprovado por faltas!\n");
    } else if (nota < 7.0 && faltas <= 5) {
        printf("\nO estudante foi reprovado por nota!\n");
    } else {
        printf("\nO estudante foi reprovado por nota e faltas!\n");
    }

    return 0;
}