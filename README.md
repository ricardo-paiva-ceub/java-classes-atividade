# java-classes-atividade
Atividade da disciplina Paradigmas de Linguagem de Programação - Programação em JAVA

## Instruções ao professor
Prezado professor, eu testei a aplicação .jar no meu computador e estava funcionando sem problemas, mas, caso haja erro em executar o programa a partir do artefato .jar, peço que rode a aplicação pela IDE a partir do método main, que está localizado em java-classes-atividade/trabalhoJavaVestuario/src/com/vestuario/main/Main.java. Muito obrigado!

- Código fonte do trabalho final (Java) encontra-se na pasta /trabalhoJavaVestuario/src/com/vestuario/
- Executável do arquivo em formato .jar foi gerado, pronto para execução. Encontra-se em "Releases" no painel lateral direita do GitHub.
- Resoluções das atividades da disciplina, ordenadas por data, encontra-se na pasta /atividades/
- Demais atividades (jogo do labirinto e trabalho da oficina) encontram-se na pasta /outrosTrabalhos/

## Releases
Última release (em formato .jar): 1.6.0

*Últimas alterações:*
Acrescentada a funcionalidade de editar roupas.

Verificar na página de releases do git:
Link: https://github.com/ricardo-paiva-ceub/java-classes-atividade/releases

## Proposta da atividade - trabalho final da disciplina PLP
### Problema 1 – Vestuário
O último problema apresentado tratava do manejo de peças de um vestuário. Sendo apenas para armazená-las em um guarda-roupas.

Vamos ampliar a situação e tratarmos o problema de forma mais ampla. Para isso, vamos organizar as ideias da seguinte forma: iremos listar todos os pontos observados do problema, em seguida, projetar as classes que irão compor o sistema, só então partiremos para a codificação. Veja a seguir o problema. As roupas se dividem em categorias, sendo essas:

- social
- esporte
- esporte fino
- trabalho

Todas as roupas possuem características como:
- cor
- número do manequim
- tecido com o qual é feito
- preço

As roupas podem se encontrar em 3 (três) situações (status) distintas:
- no guarda-roupas
- em uso
- na lavanderia

O sistema deve nos dizer:
- quantas roupas estão na lavanderia
- quantas roupas estão no guarda-roupas
- qual a cor predominante no guarda-roupas
- adicionar e remover roupas
