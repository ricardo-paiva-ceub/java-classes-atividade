# java-classes-atividade
Atividade da disciplina Paradigmas de Linguagem de Programação - Programação em JAVA

## Instruções ao professor
Para executar o arquivo .jar:
1) Baixar o arquivo .jar nas "Releases" na barra lateral direita desta página do GitHub.
2) Navegar no terminal até a pasta onde foi baixado o arquivo .jar.
3) Executar o arquivo com o comando `java -jar "nomedoarquivo"`.
4) A versão instalada do openJDK deve ser pelo menos a 11 (preferencialmente a 17).

Prezado professor, eu testei a aplicação .jar no meu computador e estava funcionando sem problemas, mas, caso haja erro em executar o programa a partir do artefato .jar, peço que rode a aplicação pela IDE a partir do método main, que está localizado em [java-classes-atividade/trabalhoJavaVestuario/src/com/vestuario/main/Main.java](https://github.com/ricardo-paiva-ceub/java-classes-atividade/blob/master/trabalhoJavaVestuario/src/com/vestuario/main/Main.java).

Caso necessário, peço que faça uso da IDE IntelliJ IDEA, pois o aplicativo foi desenvolvido nessa IDE e utiliza o desginer de layout Java Swing próprio dessa IDE, que não está presente nas outras IDEs no mercado. Site para download da IDE: https://www.jetbrains.com/pt-br/idea/download/ . O projeto não será reconhecido no Eclipse ou no NetBeans por causa do designer de layout da interface gráfica.

Para a correta execução do arquivo .jar no Linux, é preciso a utilização pelo menos do openJDK 11. Para executar o .jar, é necessário ir até o diretório do arquivo no terminal e rodar o arquivo com java -jar <nomearquivo>, assegurando que a versão do jdk selecionada seja a 11 para cima (pode-se alterar a versão do jdk instalada com o comando `sudo update alternatives --config java`.

- Código fonte do trabalho final (Java) encontra-se na pasta /trabalhoJavaVestuario/src/com/vestuario/
- Executável do arquivo em formato .jar foi gerado, pronto para execução. Encontra-se em "Releases" no painel lateral direita do GitHub.
- Resoluções das atividades da disciplina, ordenadas por data, encontra-se na pasta /atividades/
- Demais atividades (jogo do labirinto e trabalho da oficina) encontram-se na pasta /outrosTrabalhos/

## Releases
Última release (em formato .jar): 1.6.0 (compatibilidade)

*Últimas alterações:*
Compatilibidade com o openJDK 11.
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
