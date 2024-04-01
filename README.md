# Projeto de Exemplo usando JDBC e o Padrão DAO

Este é um exemplo de projeto em Java que demonstra o uso do JDBC (Java Database Connectivity) e o padrão de projeto DAO (Data Access Object). O projeto gerencia duas tabelas em um banco de dados relacional: Sellers (vendedores) e Department (departamentos).

## Pré-requisitos

Certifique-se de ter o seguinte instalado em seu ambiente de desenvolvimento:

- Java Development Kit (JDK)
- MySQL Server
- IDE Java (recomendado, mas não obrigatório)

## Configuração do Banco de Dados

1. Crie um banco de dados chamado `coursejdbc` no seu servidor MySQL.
2. Execute o script `script.sql` fornecido na pasta `database` para criar as tabelas `Sellers` e `Department` e definir as relações entre elas.

## Configuração do Projeto

1. Clone este repositório em sua máquina local.
2. Importe o projeto para sua IDE Java ou compile manualmente os arquivos `.java`.

## Executando os Programas de Teste

- Para testar as funcionalidades dos vendedores (Sellers), execute o arquivo `Program.java`.
- Para testar as funcionalidades dos departamentos (Departments), execute o arquivo `Program2.java`.

## Estrutura do Projeto

- `src/`
    - `model/`: Contém as classes de modelo (`Seller.java` e `Department.java`) que representam os objetos de vendedor e departamento.
    - `dao/`: Contém as classes DAO (`SellerDAO.java` e `DepartmentDAO.java`) que encapsulam o acesso ao banco de dados.
    - `Program.java`: Programa de teste para funcionalidades dos vendedores.
    - `Program2.java`: Programa de teste para funcionalidades dos departamentos.

## Observações Importantes

- Cada vendedor precisa estar vinculado a um departamento, enquanto um departamento pode existir sem estar vinculado a um vendedor.
- O projeto utiliza o JDBC para comunicação com o banco de dados e o padrão DAO para encapsular as operações de acesso a dados.

## Contribuindo

Sinta-se à vontade para enviar pull requests com melhorias ou correções de bugs. Toda contribuição é bem-vinda!
