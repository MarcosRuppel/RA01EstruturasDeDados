# Estruturas de Dados - Pilhas, Filas e Listas Encadeadas

Bacharelado em Ciência da Computação - PUCPR

Atividade para a avaliação RA01 da disciplina Resolução de Problemas Estruturados em Computação - prof. Andrey Cabral Meira

Equipe: 
- Enzo Curcio Stival
- Hiann Wonsowicz Padilha
- Marcos Paulo Ruppel

## Exercício Prático: Sistema de Gerenciamento de Atendimento ao Cliente

Desenvolva um programa em Java que simule um sistema de gerenciamento de atendimento ao cliente utilizando uma lista para Implementar uma pilha e uma fila. A pilha será usada para armazenar um histórico de solicitações de serviço, enquanto a fila será usada para gerenciar a ordem de atendimento dos clientes.

*EXPRESSAMENTE PROIBIDA A UTILIZAÇÃO DE FUNÇÕES PRONTAS!*

- Apenas String, int, float, try-catch, throws e alguma função de input podem ser utilizadas. 
- Length não poderá ser utilizado. Nem vector e lists.

## Pilha - Histórico de Solicitações:

Implemente uma pilha usando uma lista encadeada.
- Cada elemento deve conter informações da solicitação (ID da solicitação, descrição, data e hora).
- Inclua métodos para adicionar e remover solicitações do histórico.

## Fila - Ordem de Atendimento:

Implemente uma fila usando uma lista encadeada.
- Cada elemento deve conter informações do cliente (nome, número de identificação, motivo do atendimento).
- Inclua métodos para adicionar clientes à fila e atender o próximo cliente.

## Estruturas auxiliares:
```
// Classe para representar uma solicitação ou cliente
class Elemento {
    String id;
    String descricao;
    // Outros atributos omitidos para brevidade
}
```
```
// Classe para representar a pilha usando lista encadeada
class Pilha {
    private Node topo;

    // Métodos para adicionar e remover elementos da pilha
}
```
```
// Classe para representar a fila usando lista encadeada
class Fila {
    private Node frente;
    private Node tras;

    // Métodos para adicionar e atender clientes na fila
}
```
```
// Classes Node, Pilha e Fila omitidas para brevidade
```
