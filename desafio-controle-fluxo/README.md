# DIO | Desafio - Controle de Fluxo

Este repositório contém um projeto Java básico desenvolvido como parte do curso "Formação Java" da [Digital Innovation One](https://www.dio.me/). O objetivo do desafio foi criar uma aplicação simples que realizasse uma contagem com base na entrada de dois parâmetros informados pelo usuário, utilizando estruturas de controle de fluxo e tratamento de exceções.

## 📌 Descrição
O projeto `Contador` solicita ao usuário dois números inteiros:

1. Primeiro parâmetro;  
2. Segundo parâmetro.

Com essas informações, o programa calcula a diferença entre os valores e exibe mensagens de contagem no console.  
Caso o segundo parâmetro seja **menor que o primeiro**, é lançada uma exceção personalizada com uma mensagem de erro.

> 💡 Este exercício tem como objetivo a prática de entrada de dados com `Scanner`, estrutura de repetição `for`, criação de exceções personalizadas e uso de `try/catch`.

## 🚀 Como executar

### 1. Clone o repositório:
```bash
git clone https://github.com/GeovanniMarques/dio-trilha-java-basico.git
```

### 2. Acesse o diretório do projeto:
```bash
cd dio-trilha-java-basico
```

### 3. Navegue até a pasta do desafio:
```bash
cd desafio-controle-fluxo
```

### 4. Compile e execute o programa:
```bash
javac Contador.java
java Contador
```

Ou abra o projeto em uma IDE como Eclipse ou IntelliJ IDEA.

## 📷 Exemplo de execução

```text
Digite o primeiro parâmetro:
5
Digite o segundo parâmetro:
8

Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
```

Se o segundo número for menor:
```text
Digite o primeiro parâmetro:
10
Digite o segundo parâmetro:
5

O 2º parâmetro deve ser maior que o 1º.
```

## 🧠 Comandos Git utilizados no projeto

```bash
git init
git add .
git commit -m "primeiro commit do projeto Desafio - Controle de Fluxo"
git remote add origin https://github.com/GeovanniMarques/dio-trilha-java-basico.git
git push -u origin main
```

## 🔍 Referência do desafio

- [Desafio Controle de Fluxo - DIO (Digital Innovation One)](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo)