# Show do Milhão --- Java e NetBeans

Este projeto consiste na implementação do jogo Show do Milhão,
desenvolvido em Java com interface gráfica construída utilizando o
Apache NetBeans (GUI Builder). O sistema inclui telas interativas,
lógica de perguntas e respostas, ranking e integração com banco de dados
MySQL.

## Funcionalidades

-   Tela inicial do jogo.
-   Sistema completo de perguntas com alternativas.
-   Lógica de validação de respostas.
-   Tela de derrota.
-   Tela de ranking com dados persistidos.
-   Integração com banco de dados MySQL.
-   Estrutura organizada em classes e formulários criados no NetBeans.

## Estrutura do Projeto

    JavaApplication5/
     ┣ src/
     ┃ ┣ imgs/                     
     ┃ ┗ javaapplication5/
     ┃    ┣ Inicio.java            
     ┃    ┣ Jogo.java              
     ┃    ┣ Perdeu.java            
     ┃    ┣ Ranking.java           
     ┃    ┗ JConnectorDB.java      
     ┣ quizztec.sql                
     ┣ mysql-connector-j-9.1.0.jar 
     ┣ build.xml                   
     ┗ dist/                       

## Tecnologias Utilizadas

-   Java SE 8 ou superior.
-   Swing (Javax Swing).
-   Apache NetBeans.
-   MySQL.
-   JDBC (mysql-connector-j).

## Banco de Dados

O arquivo `quizztec.sql` contém as estruturas necessárias para a base de
dados utilizada pelo jogo.\
A conexão é realizada pela classe `JConnectorDB.java`, que deve ser
configurada com as credenciais apropriadas de acesso ao MySQL.

## Como Executar

### Pré-requisitos

-   Java 8 ou superior.
-   Apache NetBeans.
-   MySQL instalado.
-   Driver JDBC compatível (já incluído no projeto).

### Passos

1.  Importar o projeto no NetBeans.
2.  Importar o arquivo `quizztec.sql` para o MySQL.
3.  Ajustar as credenciais de acesso em `JConnectorDB.java`.
4.  Executar o projeto pelo NetBeans (F6).

## Melhorias Futuras

-   Ampliação do banco de perguntas.
-   Implementação de sistema de níveis.
-   Adição de efeitos sonoros.
-   Modernização da interface gráfica.

## Autor

Efrain Oliveira. Projeto desenvolvido para fins acadêmicos.

## Licença

Projeto livre para uso e modificação acadêmica.
