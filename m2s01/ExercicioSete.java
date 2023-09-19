package m2s01;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos calcular! Insira um número:");
        double number1 = scanner.nextDouble();
        System.out.println("Insira outro número:");
        double number2 = scanner.nextDouble();
        double result = 0;

        System.out.println("Agora, escolha uma operação matemática (digite o número correspondente):" +
                "\n1. Soma" +
                "\n2. Subtração" +
                "\n3. Multiplicação" +
                "\n4. Divisão");
        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                result = number1 + number2;
                System.out.printf("O resultado é %.2f", result);
                break;
            case 2:
                result = number1 - number2;
                System.out.printf("O resultado é %.2f", result);
                break;
            case 3:
                result = number1 * number2;
                System.out.printf("O resultado é %.2f", result);
                break;
            case 4:
                result = number1 / number2;
                System.out.printf("O resultado é %.2f", result);
                break;
            default:
                System.out.println("Operação inexistente.");
                break;
        }

    }
}
