import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Menu Bancário ===");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");

        try {
            int opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu: Consultar Saldo");
                    break;
                case 2:
                    System.out.println("Você escolheu: Depositar");
                    break;
                case 3:
                    System.out.println("Você escolheu: Sacar");
                    break;
                case 4:
                    System.out.println("Você escolheu: Sair");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção de 1 a 4.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Digite um número válido.");
        }

        scanner.close();
    }
}
