# Atividade 03/09/2021
# Comandos de iteração

Existem situações nas quais você precisará repetir a execução de um mesmo bloco de código. Por exemplo, para calcular a nota de todos os alunos de uma sala, você precisará executar o código de cálculo de média repetidamente, uma vez para cada aluno da sala. Nesta aula, vamos apresentar os comandos utilizados em tais situações, os chamados de comandos de iteração.

Objetivos
Ao final desta aula, você será capaz de:
Descrever o funcionamento dos comandos de iteração.
Saber aplicar corretamente comandos de iteração, visando executar repetidas vezes determinados trechos de código.
Laço for

Cria-se uma variável de controle, que poderá servir como uma espécie de contador, ou seja, para contar o número de vezes que o bloco de comandos será executado.
A variável recebe um valor inicial (chamamos a esse processo de “inicialização”). No caso de um contador, geralmente, esse valor inicial é 0 (zero) ou 1 (um).
Uma “condição” determinada (por exemplo, se o valor final do contador foi atingido) é testada e, se for verdadeira, o bloco de comandos que pertence ao laço é executado. É através dessa condição que é determinado o número de repetições do laço.
A variável de controle é incrementada ou decrementada.
O programa então voltará ao passo 3 do laço para testar novamente a condição. Se a condição for falsa (ou seja, o valor de término tenha sido atingido), o laço é interrompido. Caso contrário, o laço continuará com os passos 3 e 4, e assim novamente.

## Atividade 01
Implemente o ProgramaForAsterisco mostrado e indique qual a resposta produzida pelo programa.
Implemente o ProgramaFor2 mostrado anteriormente e indique qual a resposta produzida pelo programa. Comente em cima da quantidade de vezes em que o laço dentro do programa é executado.
Implemente e execute o ProgramaForInfinito. Relate o que acontece e como você para a execução do programa.
Implemente um programa que realiza um laço infinito e que, em cada laço, mostre a quantidade de vezes que ele já foi executado.

## Atividade 02
Implemente e execute o ProgramaFor e o ProgramaWhileSorteio.
Implemente um programa chamado ProgramaForSorteio que é a implementação do ProgramaWhileSorteio usando-se for ao invés de while.

## Atividade 03
Implemente e execute os programas ProgramaWhileSorteio2 e ProgramaDoWhileSorteio.
Crie um programa que leia um número e que imprima o seu valor ao quadrado. Caso o quadrado desse número seja igual a 0 (zero), o programa deve sair.

## Autoavaliação
Escreva um programa que leia 10 números e que escreva na tela apenas os que forem ímpares.
Escreva um programa que solicite um número entre 1 e 4. Caso o número digitado seja diferente, mostre a mensagem "Número inválido". Caso contrário, escreva o número na tela.
Escreva um programa que gere a saída : 0, 2, 4, 6, 8, 10, 12, 14.
Referências
ASCENCIO, Ana Fernanda Gomes; CAMPOS, Edilene Aparecida Veneruchi de. Fundamentos da programação de computadores: algoritmos, Pascal, C/C++ e Java. São Paulo: Editora Pearson, 2008.
THE JAVA tutorials. Disponível em: <http://download.oracle.com/javase/tutorial/&gt;. Acesso em: 6 dez. 2011.