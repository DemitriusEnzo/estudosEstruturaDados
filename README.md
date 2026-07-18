# Estudos de Estrutura de Dados em Java

Um repositório dedicado ao aprendizado e prática de conceitos fundamentais de estrutura de dados, desenvolvido em **Java**. Este repositório documenta a jornada de estudo através de implementações, exemplos práticos e exercícios.

## Sobre

Este repositório foi criado com o objetivo de:

- **Consolidar conhecimento** sobre os principais conceitos de estrutura de dados
- **Implementar estruturas** de forma didática, com foco na compreensão dos mecanismos internos
- **Registrar progressão** no aprendizado de programação orientada a objetos e algoritmos em Java
- **Servir como referência** para consulta e revisão de conceitos implementados

Os materiais aqui presentes são voltados para estudos acadêmicos e práticas de programação, permitindo visualizar como diferentes estruturas de dados funcionam internamente e como aplicá-las em situações práticas.

## Estrutura do Repositório

```
src/
├── Introducao/              # Conceitos iniciais e classes básicas
├── AlgoritmosRecursivos/    # Implementações de algoritmos com recursão
├── PilhasSequenciais/       # Pilhas implementadas com arranjos (arrays)
├── PilhasEncadeadas/        # Pilhas implementadas com nós encadeados
├── FilasSequenciais/        # Filas implementadas com arranjos
├── FilaEncadeada/           # Filas implementadas com nós encadeados
├── ListaEncadeada/          # Estrutura de nó para listas encadeadas
├── Arvore/                  # Árvores binárias de busca e AVL
└── Checkpoint5ABB/          # Projeto prático com árvore binária
```

## Conteúdos Estudados

### 1. **Introdução e Conceitos Básicos**
   - Classe `Aluno`: Exemplo básico de encapsulamento e manipulação de dados
   - Demonstra leitura de dados, cálculo de média e apresentação de informações

### 2. **Algoritmos Recursivos**
   - `Somatorio.java`: Implementação recursiva de somatório
   - Conceito de condição de parada e chamadas recursivas

### 3. **Pilhas (Stack)**

   **Pilhas Sequenciais (com arranjos):**
   - `PilhaInt.java`: Implementação de pilha com array de tamanho fixo
   - Operações: `init()`, `push()`, `pop()`, `top()`, `isEmpty()`, `isFull()`
   - `Teste.java`: Exemplo de uso prático de pilhas sequenciais

   **Pilhas Encadeadas (com nós):**
   - `Pilha_INT.java`: Implementação com estrutura de nó encadeado
   - Oferece maior flexibilidade pois não possui limite de tamanho predefinido
   - Classe interna `NO` para representar nós
   - Classe interna `Retorno` para tratamento de resultados e erros

### 4. **Filas (Queue)**

   **Filas Sequenciais (com arranjos):**
   - `FilaInt.java`: Implementação com array de tamanho fixo
   - Operações: `init()`, `enqueue()`, `dequeue()`, `first()`, `isEmpty()`, `isFull()`
   - `FilaString.java`: Variante com dados do tipo `String`
   - `MainTeste.java`: Exemplo de uso de filas sequenciais

   **Filas Encadeadas (com nós):**
   - `FilaInt.java` (em FilaEncadeada): Implementação com nós encadeados
   - Operações: `init()`, `enqueue()`, `dequeue()`, `first()`, `isEmpty()`
   - `Ex02.java`: Aplicação prática simulando fila de processos com execução e requeue

### 5. **Listas Encadeadas**
   - `NO.java`: Estrutura básica de nó com campo `dado` e referência `prox`
   - Fundação para implementação de listas, filas e pilhas encadeadas

### 6. **Árvores Binárias**

   **Árvore Binária de Busca (ABB):**
   - `ABBint.java`: Implementação completa de ABB com inteiros
   - Operações: inserir, buscar, remover, contar nós, encontrar mínimo e máximo
   - Cálculo de comparações em consultas
   - `MenuAbb.java`: Interface interativa para manipulação da árvore

   **Árvore AVL:**
   - `AVLint.java`: Implementação de árvore AVL auto-balanceada
   - Operações de inserção com cálculo de altura
   - Método `showFB()` para exibir fator de balanceamento
   - Operação de rotação à direita para rebalanceamento

### 7. **Checkpoint 5 - Projeto Prático (ABB)**
   - `Cliente.java`: Classe que modela um cliente bancário
   - Atributos: nome, documento, número da conta, tipo de conta, saldo de aplicações
   - Exemplo de aplicação real de estrutura de dados com ABB

## Exercícios e Prática

O repositório contém vários exercícios práticos:

- **Teste de Pilhas**: Manipulação básica com push, pop e consultas
- **Teste de Filas**: Operações de enqueue e dequeue
- **Simulador de Fila de Processos** (`Ex02.java`): Simula um sistema operacional onde processos entram em fila, são executados e podem retornar à fila
- **Menu Interativo de ABB** (`MenuAbb.java`): Permite inserção, busca, remoção e análise de uma árvore binária de busca
- **Recursão**: Implementação de somatório utilizando recursão

## Projetos

### Sistema de Gestão Bancária com ABB (Checkpoint 5)
- **Objetivo**: Aplicar conceitos de árvore binária em um contexto prático
- **Tecnologias**: Java, Árvore Binária de Busca
- **Principais Conceitos**: Organização de dados, busca eficiente, estrutura hierárquica
- **Classe Principal**: `Cliente.java` com atributos para representar informações bancárias

## Como Utilizar Este Repositório

1. **Começar pelos Fundamentos**: Inicie com a pasta `Introducao` e `AlgoritmosRecursivos`
2. **Estudar Estruturas Sequenciais**: Explore `PilhasSequenciais` e `FilasSequenciais`
3. **Aprender Estruturas Encadeadas**: Prossiga para `PilhasEncadeadas` e `FilaEncadeada`
4. **Praticar com Árvores**: Estude `Arvore` e execute `MenuAbb` para praticar
5. **Revisar Conceitos**: Consulte o código-fonte e compare diferentes implementações

Cada diretório contém implementações que podem ser compiladas e executadas independentemente. Os exemplos de teste demonstram como utilizar cada estrutura.

## Tecnologias e Ferramentas

- **Linguagem**: Java
- **Ambiente**: IDE Java (IntelliJ IDEA - conforme arquivo `.idea`)
- **Conceitos**: Programação Orientada a Objetos, Estruturas de Dados, Algoritmos

## Objetivos de Aprendizado

Ao estudar este repositório, você será capaz de:

- ✓ Implementar pilhas tanto em versão sequencial quanto encadeada
- ✓ Implementar filas tanto em versão sequencial quanto encadeada
- ✓ Compreender o funcionamento de listas encadeadas
- ✓ Construir e manipular árvores binárias de busca
- ✓ Implementar árvores AVL auto-balanceadas
- ✓ Analisar complexidade de operações em estruturas de dados
- ✓ Aplicar estruturas de dados em problemas práticos
- ✓ Entender recursão através de implementações concretas
- ✓ Comparar eficiência entre implementações sequenciais e encadeadas
