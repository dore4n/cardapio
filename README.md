# Cardápio Digital - Backend

Este repositório contém o backend da aplicação de Cardápio Digital, desenvolvido utilizando Java Spring para fornecer um servidor robusto, com persistência de dados gerenciada por Spring Data JPA e conexão com banco de dados PostgreSQL.

## 💻 Requisitos

Para rodar este projeto, você precisa ter os seguintes itens instalados em sua máquina:

- Java 17 ou superior
- Maven
- PostgreSQL

## 🚀 Instalando o Projeto

Siga os passos abaixo para configurar e rodar o projeto em sua máquina local:

1. Clone o repositório:

   ```bash
   # Clone o repositório
   $ git clone https://github.com/dore4n/cardapio

   # Acesse o diretório do projeto
   $ cd cardapio
Configure o banco de dados PostgreSQL:

Certifique-se de que o PostgreSQL está instalado e rodando em sua máquina. Crie um banco de dados para a aplicação.

sql
Copiar código
CREATE DATABASE cardapio;
Atualize o arquivo src/main/resources/application.properties com as informações do seu banco de dados:

properties
Copiar código
spring.datasource.url=jdbc:postgresql://localhost:5432/cardapio
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
Compile e rode o projeto usando o Maven:

bash
Copiar código
# Compile o projeto
$ mvn clean install

# Rode o projeto
$ mvn spring-boot:run
O servidor será iniciado na porta 8080 por padrão.


# Redes Sociais
Portfólio: dore4n.github.io 
Instagram: @lucasdore4n
Linkedin: in/lucasebsantos
