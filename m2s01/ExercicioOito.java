package m2s01;

import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = getInput("Insira um valor inicial:", scanner);
        int root = getInput("Insira um valor para a raiz:", scanner);
        int operation = getInput("Qual operação deseja realizar? Serão calculados os 10 primeiros valores (digite o número correspondente)." +
                "\n1. Progressão aritmética" +
                "\n2. Progressão geométrica", scanner);

        switch (operation) {
            case 1:
                for (int i = 0; i < 10; i++) {
                    System.out.println(value);
                    value = value + root;
                }
                break;
            case 2:
                for (int i = 0; i < 10; i++) {
                    System.out.println(value);
                    value = value * root;
                }
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
    }
    private static int getInput(String message, Scanner scanner) {
        System.out.println(message);

        String input = scanner.nextLine();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido.");
            return getInput(message, scanner);
        }
    }
}
