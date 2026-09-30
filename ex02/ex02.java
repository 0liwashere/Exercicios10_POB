import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversaoVetor {

    public static void main(String[] args) {
        String[] valores = {"10", "25", "abc", "50"};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o índice desejado (0 a " + (valores.length - 1) + "): ");
            int indice = scanner.nextInt();

            String valorTexto = valores[indice];
            int valorConvertido = Integer.parseInt(valorTexto);

            System.out.println("Valor convertido: " + valorConvertido);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: índice inexistente no vetor.");

        } catch (NumberFormatException e) {
            System.out.println("Erro: a string escolhida não é um número válido.");

        } catch (InputMismatchException e) {
            System.out.println("Erro: digite apenas números inteiros para o índice.");

        } finally {
            System.out.println("Operação finalizada.");
            scanner.close();
        }
    }
}
