# Totem Mercado

Projeto desenvolvido em **Java** utilizando o **IntelliJ IDEA** para praticar conceitos de Programação Orientada a Objetos.

## Funcionalidades

- Criar pedidos
- Listar produtos
- Buscar produtos por ID
- Adicionar produtos ao pedido
- Calcular o valor total
- Aplicar desconto fixo
- Aplicar desconto percentual
- Finalizar pedidos
- Gerar ticket

## Conceitos utilizados

- Classes e objetos
- Encapsulamento
- Herança
- Classe abstrata
- Interface
- Polimorfismo
- Enum
- Associação entre classes
- `ArrayList`
- Estruturas de repetição
- Menu com `Scanner`

## Estrutura do projeto

```text
src/
└── ProjetoMercado/
    ├── dominio/
    │   ├── Produto.java
    │   ├── Alimento.java
    │   ├── Bebida.java
    │   ├── Limpeza.java
    │   ├── CatalogoProdutos.java
    │   ├── ItemPedido.java
    │   ├── Pedido.java
    │   ├── StatusPedido.java
    │   └── Ticket.java
    │
    ├── interfaces/
    │   └── Desconto.java
    │
    ├── servico/
    │   ├── DescontoFixo.java
    │   └── DescontoPercentual.java
    │
    └── test/
        └── MercadoTest.java
```

## Tecnologias

- Java
- IntelliJ IDEA

## Como executar

1. Clone o repositório:

```bash
git clone https://github.com/jdougl4s/totem-mercado.git
```

2. Abra o projeto no IntelliJ IDEA.

3. Execute a classe que contém o método `main`.

## Autor

Desenvolvido por [Douglas](https://github.com/jdougl4s).
