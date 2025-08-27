# Florinda Eats - Módulo de Pedidos

## Sobre o Projeto

Este é um projeto Spring Boot simples que gerencia pedidos.

O projeto demonstra conceitos como:
- API REST com Spring Web
- Persistência de dados com Spring Data JPA
- Migrações de banco de dados com Flyway
- Integração com Docker para o ambiente de desenvolvimento

## Tecnologias Utilizadas

- **Linguagem:** Java 21
- **Framework:** Spring Boot 3.5.5
- **Build Tool:** Gradle
- **Banco de Dados:** MySQL 9
- **Migrações:** Flyway
- **Containerização:** Docker Compose

## Pré-requisitos

Antes de começar, você precisará ter as seguintes ferramentas instaladas em sua máquina:
- [JDK 21](https://www.oracle.com/java/technologies/downloads/#java21) ou superior
- [Docker](https://www.docker.com/get-started) e [Docker Compose](https://docs.docker.com/compose/install/)

## Como Executar

1.  **Clone o repositório:**
    ```bash
    git clone <url-do-repositorio>
    cd pedidos
    ```

2.  **Inicie o banco de dados com Docker:**
    O arquivo `docker-compose.yml` na raiz do projeto irá configurar e iniciar um container MySQL.
    ```bash
    docker-compose up -d
    ```
    O banco de dados estará acessível em `localhost:3306`.

3.  **Execute a aplicação Spring Boot:**
    Use o Gradle Wrapper para compilar e iniciar a aplicação.
    ```bash
    ./gradlew bootRun
    ```
    A aplicação estará disponível em `http://localhost:8080`.

## API

A API pode ser testada utilizando a coleção do Postman incluída no projeto: `Florinda Eats Pedidos.postman_collection.json`.

Importe este arquivo no seu Postman para ter acesso a todas as requisições prontas para uso.
