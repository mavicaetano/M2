package m2s01;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para descobrir se é par ou ímpar:");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("É par!");
        } else {
            System.out.println("É ímpar!");
        }
    }
}
