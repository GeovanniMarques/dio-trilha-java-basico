import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja bem-vindo ao contador!");

        System.out.print("Por gentileza, informe o 1º parâmetro: ");
        int primeiroParametro = scanner.nextInt();
        System.out.print("Agora, informe o 2º parâmetro: ");
        int segundoParametro = scanner.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O 2º parâmetro deve ser maior que o 1º.");
        }

        scanner.close();
    }

    public static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if (primeiroParametro > segundoParametro) {
            throw new ParametrosInvalidosException("O 2º parâmetro deve ser maior que o 1º.");
        }

        int contagem = segundoParametro - primeiroParametro;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }

        System.out.println("Contagem concluída!");

    }

}
