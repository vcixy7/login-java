# Projeto de Login em Java

Este é um projeto simples de sistema de login desenvolvido em Java utilizando
MySQL como banco de dados.

O objetivo principal é permitir que usuários se cadastrem e façam login através
do console, com validação direta no banco de dados.

---

## Funcionalidades atuais

- Cadastro de usuário com nome, e-mail e senha
- Validação da confirmação de senha
- Login de usuário com validação no MySQL
- Geração de código aleatório para futura recuperação de senha

⚠️ Observação: o projeto funciona **apenas via console**  
⚠️ A recuperação de senha ainda não está totalmente implementada

---

## Futuras melhorias

- Interface gráfica (JavaFX ou Swing)
- Recuperação de senha via e-mail
- Criptografia de senha
- Validação avançada de dados

---

## Banco de Dados

O projeto utiliza **MySQL**.

### Estrutura da tabela
CREATE DATABASE testejava;
USE testejava;

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    senha VARCHAR(50) NOT NULL,
    log VARCHAR(50)
);


### Como rodar o projeto
**1️⃣ Clonar o repositório**

git clone https://github.com/vcixy7/login-java.git

cd login-java


**2️⃣ Baixar o MySQL Connector/J**

Baixe o driver JDBC:

https://dev.mysql.com/downloads/connector/j/

Coloque o arquivo .jar na pasta raiz do projeto.



**3️⃣ Configurar a conexão**

No arquivo Conexao.java, ajuste:

private static final String url = "jdbc:mysql://localhost:3306/testejava";

private static final String user = "root"; // seu usuario

private static final String password = "root"; // sua senha

**4️⃣ Compilar o projeto**

No terminal, dentro da pasta login-java:

javac -cp mysql-connector-j-9.4.0.jar;. src/Main.java src/conexao/*.java src/dao/*.java

**5️⃣ Executar**

java -cp mysql-connector-j-9.4.0.jar;. Main

Menu do sistema

1 - Login

2 - Cadastrar

3 - Esqueceu a senha?

Digite a opção desejada e siga as instruções no console.
