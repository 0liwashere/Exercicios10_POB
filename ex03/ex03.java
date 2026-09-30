import java.util.Scanner;

public class TesteContaCorrente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente("12345-6", 1000.0);

        try {
            System.out.print("Digite o valor do saque: ");
            double valorSaque = scanner.nextDouble();

            conta.sacar(valorSaque);

        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());

        } finally {
            System.out.println("Operação finalizada.");
            scanner.close();
        }
    }
}
