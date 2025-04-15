# 12 Factor Spring Boot App

Este projeto é um exemplo prático de aplicação Spring Boot seguindo os [12 fatores](https://12factor.net/).

## Como executar

### Com Maven
```bash
mvn clean package
java -jar target/12factor-springboot-app-1.0.0.jar
```

### Com Docker
```bash
docker-compose up --build
```

### Tarefa administrativa (Fator 12)
```bash
java -jar target/12factor-springboot-app-1.0.0.jar run-admin-task
```

## Endpoints
- `GET /hello?name=Fernando` → retorna mensagem personalizada
