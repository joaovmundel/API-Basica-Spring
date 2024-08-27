
# Spring API Básica

Essa API realiza consultas e salva usuários no banco de dados H2, além de ter um endpoint para realizar o cálculo do fatorial de um número.


## Documentação da API

#### Retorna o fatorial do número passado

```http
  GET /fatorial/${numero}
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `numero` | `Integer` | O número para calcular o fatorial |


+ Response 200 (Raw/Text)
    + Body
        ```text
        5 X 4 X 3 X 2 X 1 = 120
        ```


#### Retorna usuários com 25+ anos de idade

```http
  GET /usuario
```
+ Response 200 (Application/Json)
    + Body
        ```json
        [
            {
                "id": 1,
                "nome": "Joao",
                "email": "email@example.com",
                "idade": 26 
            },
            {
                "id": 2,
                "nome": "Ana",
                "email": "email@example.com",
                "idade": 27 
            }
        ]
        ```

#### Cria um novo usuário
```http
  POST /usuario
```
+ Request (Application/Json)
    + Body
        ```json
        {
           "nome": "Joao",
           "email": "email@example.com",
           "idade": 26 
        }
        ```
+ Response 201 (Application/Json)
    + Body
        ```json
        {
           "id": 1,
           "nome": "Joao",
           "email": "email@example.com",
           "idade": 26 
        }
        ```




