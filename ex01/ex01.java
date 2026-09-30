import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoSegura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número (dividendo): ");
            int dividendo = scanner.nextInt();

            System.out.print("Digite o segundo número (divisor): ");
            int divisor = scanner.nextInt();

            int resultado = dividendo / divisor;
            System.out.println("Resultado da divisão: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: não é possível dividir por zero.");

        } catch (InputMismatchException e) {
            System.out.println("Erro: por favor, digite apenas números inteiros.");

        } finally {
            System.out.println("Operação finalizada.");
            scanner.close();
        }
    }
}
