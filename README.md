# 🔗 URL Shortener - Spring Boot + MongoDB

Um simples e funcional encurtador de URLs construído com **Spring Boot**, **MongoDB** e **Docker**. Permite criar URLs curtas e redirecionar os acessos para o link original.

---

## 🚀 Funcionalidades

- ✅ Encurtar uma URL longa
- ✅ Redirecionar automaticamente a URL curta para o link original
- ✅ Persistência com MongoDB
- ✅ Banco de dados via container Docker
- ✅ API REST simples e direta

---

## 📦 Tecnologias

- Java 21
- Spring Boot 3.5
- Spring Data MongoDB
- Docker
- MongoDB
- Jakarta Servlet

---

## 🔧 Como rodar localmente

### Pré-requisitos

- Java 21
- Docker e Docker Compose

### 1. Suba o MongoDB com Docker

```bash
docker-compose up -d
```

### 2. Rode a aplicação

```bash
./mvnw spring-boot:run
```

### 3. Acesse a API
A API estará disponível em `http://localhost:8080`.

Claro! Aqui está o `README.md` completo em **um único bloco**, pronto para colar no seu projeto:

````markdown
# 🔗 URL Shortener - Spring Boot + MongoDB

Um simples e funcional encurtador de URLs construído com **Spring Boot**, **MongoDB** e **Docker**. Permite criar URLs curtas e redirecionar os acessos para o link original.

---

## 🚀 Funcionalidades

- ✅ Encurtar uma URL longa
- ✅ Redirecionar automaticamente a URL curta para o link original
- ✅ Persistência com MongoDB
- ✅ Banco de dados via container Docker
- ✅ API REST simples e direta

---

## 📦 Tecnologias

- Java 17+
- Spring Boot 3+
- Spring Data MongoDB
- Docker
- MongoDB
- Jakarta Servlet

---

## 🔧 Como rodar localmente

### Pré-requisitos

- Java 17 ou superior
- Docker e Docker Compose

### 1. Suba o MongoDB com Docker

```bash
docker-compose up -d
````

> Garante que o MongoDB estará disponível na porta `27017`.

### 2. Rode a aplicação

```bash
./mvnw spring-boot:run
```

A aplicação estará disponível em:

```
http://localhost:8080
```

---

## 📌 Endpoints

### `POST /shorten-url`

Cria uma URL encurtada a partir de uma URL longa.

#### 🔸 Exemplo de requisição:

```json
POST /shorten-url
Content-Type: application/json

{
  "fullUrl": "https://www.google.com"
}
```

#### 🔹 Resposta:

```json
200 OK
{
  "shortUrl": "http://localhost:8080/abc123"
}
```

---

### `GET /{id}`

Redireciona automaticamente para a URL original.

#### 🔸 Exemplo:

```
GET /abc123
302 Found
Location: https://www.google.com
```

---

## 📁 Estrutura do Projeto

```
src/
└── main/
    ├── java/
    │   └── tech.wvs.desafiourlshorten/
    │       ├── controller/
    │       ├── service/
    │       ├── model/
    │       └── repository/
    └── resources/
        └── application.yml
```
## 🧪 Testando

Você pode usar ferramentas como:

* [Postman](https://www.postman.com/)
* [curl](https://curl.se/)
* [Insomnia](https://insomnia.rest/)



