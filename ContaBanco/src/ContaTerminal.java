/**
 * <h1>Conta em banco</h1>
 * Projeto simples solicitando dados do usuário e exibindo uma mensagem de abertura de conta bancária.
 * <p>
 * <b>Note:</b> Este projeto foi desenvolvido como parte do curso de Java básico da DIO.
 * 
 * @author Geovanni Marques
 * @version 1.0
 * @since 10/04/2025
 * 
 */

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Seja bem-vindo!\nPor gentileza, informe o seu nome e sobrenome: ");
        String nome = scanner.nextLine();

        System.out.print("Agora, informe o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Agora, informe o número da conta bancária: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Por último, informe o seu saldo bancário: R$");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá, %s, obrigado por criar uma conta em nosso banco!\nSua agência é %s, conta corrente %d e seu saldo (R$%.2f) já está disponível para saque.", nome, agencia, numeroConta, saldo);

        scanner.close();
    }
}