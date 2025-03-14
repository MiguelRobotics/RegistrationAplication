
# Projeto de Registro de Dados

Este é um simples projeto em **Java** para registrar e exibir informações pessoais de um usuário, como **nome**, **idade**, **gênero** e **número de contato**. O projeto apresenta um menu interativo que permite ao usuário escolher entre registrar os dados, exibir os dados registrados ou sair do programa.

## Funcionalidades

- **Registrar Dados**: O usuário pode inserir seu nome, idade, gênero e número de contato.
- **Exibir Dados**: O usuário pode visualizar as informações registradas.
- **Sair do Programa**: O usuário pode sair do programa a qualquer momento.

## Como Rodar o Projeto

1. **Clone o repositório** (se você tiver o projeto em um repositório Git):
    ```bash
    git clone https://github.com/seu-usuario/nome-do-repositorio.git
    ```

2. **Compile e execute o programa**:
   - Se você estiver utilizando um IDE como o IntelliJ ou Eclipse, basta executar a classe `First`.
   - Se você preferir rodar via linha de comando, navegue até o diretório do projeto e execute os seguintes comandos:

    ```bash
    javac First.java
    java First
    ```

## Estrutura do Código

- **Menu de Opções**: O programa exibe um menu para o usuário escolher a ação desejada.
- **Entrada de Dados**: O programa coleta informações sobre o nome, idade, gênero e número de contato do usuário.
- **Exibição de Dados**: O programa exibe as informações registradas quando solicitado.
  
## Exemplo de Execução

Ao executar o programa, o menu será exibido para que o usuário escolha uma das opções:

```text
=== Menu ===
1. Registrar dados
2. Mostrar dados
3. Sair
Escolha uma opção: 1
Enter your name: Miguel
Enter your age: 25
Enter your Gender (M/F): M
Enter your Contact Number: 987654321

Dados registrados com sucesso!

=== Menu ===
1. Registrar dados
2. Mostrar dados
3. Sair
Escolha uma opção: 2

=== Dados Registrados ===
Name: Miguel
Age: 25
Gender: M
Contact Number: 987654321
```

## Tecnologias Utilizadas

- **Java 8**: Linguagem utilizada para implementar o programa.
- **Scanner**: Para a coleta de dados do usuário via console.

## Contribuições

Sinta-se à vontade para contribuir com melhorias ou correções de bugs. Faça um **fork** do repositório, faça suas alterações e envie um **pull request**.

## Licença

Este projeto está sob a **Licença MIT**.

-
