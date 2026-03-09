/*
a) Um vetor é uma sequência de elementos do mesmo tipo armazenados um ao lado do outro na memória do computador.
   Na linguagem C, o nome de um vetor é um ponteiro para o primeiro elemento dele. Quando você escreve numeros[2], o compilador pega o endereço inicial e pula o espaço de dois inteiros para chegar ao valor desejado. Ele não verifica se você está tentando acessar um índice fora do limite (ex: acessar o índice 10 em um vetor de tamanho 5), o que pode causar erros de memória.

b) Uma string em C é um vetor de caracteres (char).
   A grande diferença é como 'C' sabe onde a palavra termina. Como o vetor pode ser maior que a palavra guardada, o 'C' utiliza um caractere especial de controle chamado caractere nulo (representado por '\0').
   Se você quer guardar uma palavra de 10 letras, seu vetor deve ter tamanho 11 para acomodar o '\0'.
*/