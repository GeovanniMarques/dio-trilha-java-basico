# 🏦 DIO | Projeto Conta em Banco

Este repositório contém um projeto Java básico desenvolvido como parte do curso "Formação Java" da [Digital Innovation One (DIO)](https://www.dio.me/). O objetivo do desafio era criar uma simulação simples de abertura de conta em um banco, coletando informações do usuário e exibindo uma mensagem formatada.

## 📌 Descrição

O projeto `ContaTerminal` solicita ao usuário os seguintes dados:
- Nome e sobrenome;
- Número da agência;
- Número da conta bancária;
- Saldo disponível.

Com essas informações, o programa exibe uma mensagem de confirmação da criação da conta com os dados inseridos.

> 💡 Este exercício teve como objetivo a prática de entrada de dados com `Scanner`, manipulação de tipos primitivos e saída formatada com `System.out.printf`.

## 🚀 Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/GeovanniMarques/dio-trilha-java-basico.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd dio-trilha-java-basico
   ```

3. Compile e execute o programa com o terminal ou por uma IDE como Eclipse ou IntelliJ:
   ```bash
   javac ContaTerminal.java
   java ContaTerminal
   ```

## 📷 Exemplo de execução

```
Seja bem-vindo!
Por gentileza, informe o seu nome e sobrenome: Geovanni Marques
Agora, informe o número da agência: 1234
Agora, informe o número da conta bancária: 56789
Por último, informe o seu saldo bancário: R$2500

Olá, Geovanni Marques, obrigado por criar uma conta em nosso banco!
Sua agência é 1234, conta corrente 56789 e seu saldo (R$2500.00) já está disponível para saque.
```

## 🔠 Comandos utilizados no projeto

```bash
git init
git add .
git commit -m "primeiro commit do projeto Conta em Banco"
git remote add origin https://github.com/GeovanniMarques/dio-trilha-java-basico.git
git push -u origin main
```

## 🔍 Referência do desafio

- [Desafio Conta em Banco - DIO](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe)
