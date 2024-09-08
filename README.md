# Santander Dev Week 2023

Java RESTful API criada para a Santander Dev Week

## Diagrama de classes

```mermaid
classDiagram
    class User {
        +String name
    }
    
    class Account {
        +String number
        +String agency
        +float balance
        +float limit
    }

    class Feature {
        +String icon
        +String description
    }

    class Card {
        +String cardNumber
        +float cardLimit
    }

    class News {
        +String icon
        +String description
    }

    User --> Account : has
    User --> Card : has
    User --> Feature : has many
    User --> News : has many
```
