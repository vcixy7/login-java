# Projeto de Login em Java

Este é um projeto simples de sistema de login desenvolvido em **Java**.  
O objetivo principal é permitir que usuários se cadastrem, façam login e futuramente possam recuperar a senha.

## Funcionalidades atuais

- Cadastro de usuário com nome, e-mail e senha.  
- Validação de senha na confirmação do cadastro.  
- Login de usuário com validação no banco de dados MySQL.  

> ⚠️ Observação: Atualmente, o projeto é **apenas via console**.  
> ⚠️ Observação: A funcionalidade de **recuperação de senha ainda não está totalmente implementada**.

## Futuras melhorias

- Implementação de **interface gráfica** para facilitar o uso do sistema.  
- Finalização da recuperação de senha via e-mail.  
- Melhorias na validação de dados do usuário.

## Banco de Dados

- O projeto utiliza **MySQL** para armazenar informações dos usuários.  
- A tabela utilizada é chamada `usarios` e contém as colunas:  
  - `nome`  
  - `email`  
  - `senha`  
  - `log` (para uso futuro)  

## Como rodar

Siga os passos abaixo para executar o projeto no seu computador:

### 1. Clonar o repositório
Clone o repositório para a sua máquina local usando o Git:

git clone https://github.com/vcixy7/login-java.git
cd login-java
### 2. Instalar o MySQL
Se você ainda não tem o MySQL instalado, baixe e instale:

MySQL Community Server

Durante a instalação, anote seu usuário e senha (por padrão, root).

### 3. Criar o banco de dados e a tabela
Abra o MySQL Workbench ou outro cliente e execute os comandos abaixo para criar o banco e a tabela:

CREATE DATABASE testejava;

USE testejava;

CREATE TABLE usarios (

    id INT AUTO_INCREMENT PRIMARY KEY,
    
    nome VARCHAR(50) NOT NULL,
    
    email VARCHAR(100) NOT NULL,
    
    senha VARCHAR(50) NOT NULL,
    
    log VARCHAR(50)
);

### 4. Configurar a conexão no projeto
No arquivo Conexao.java, ajuste as credenciais do banco de dados:

private static final String url = "jdbc:mysql://localhost:3306/testejava";

private static final String user = "root"; // **seu usuário**

private static final String password = "root"; // **sua senha**

### 5. Executar o projeto

Ainda no terminal:

java -cp .;mysql-connector-j-9.4.0.jar Main

O programa vai abrir no console, mostrando o menu:

1 - Login

2 - Cadastrar

3 - Esqueceu a senha?

Escolha a opção desejada digitando o número correspondente e siga as instruções.

