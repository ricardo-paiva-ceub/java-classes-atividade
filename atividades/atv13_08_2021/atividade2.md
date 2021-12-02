## Atividade 02
Como funciona o processo de compilação? Quais suas vantagens e desvantagens?Como funciona o processo de interpretação? Quais suas vantagens e desvantagens?

O processo de compilação (exemplo: C, Rust) consiste em converter um arquivo escrito em código numa linguagem de alto nível diretamente para código de máquina, gerando um binário executável pelo computador (byte code). Em geral, tendem a ter mais performance que as linguagens interpretadas e possibilitam maior controle sobre aspectos de hardware. A desvantagem é a necessidade de se compilar o código sem que houver necessidade de executário, ocasiosando perda de flexibilidade.

Já nas linguagens interpretadas (exemplo: Python, PHP, JavaScript, Ruby) há a utilização de um programa interpretador, que varre o código de alto nível linha por linha e o executa ao mesmo tempo. Não é gerado arquivo executável em linguagem de máquina, como nas linguagens compiladas: o programa é executado diretamente. O processo de interpretação é mais conveniente e flexível que a compilação, embora tenda a gerar perdas de desempenho. Além disso, linguagens interpretadas são portáveis, bastando modificar o programa interpretador a depender do sistema operacional.

Fonte:
[1] https://www.sciencedirect.com/topics/engineering/interpreted-language#:~:text=Java%20can%20be%20considered%20both,usually%20a%20software%2Dbased%20interpreter.
[2] https://www.freecodecamp.org/news/compiled-versus-interpreted-languages/