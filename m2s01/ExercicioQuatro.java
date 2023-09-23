package m2s01;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adivinhe em que número de 1 a 5 estou pensando!");
        int number = scanner.nextInt();
        int randomNumber = (int) (Math.random() * (5 - 1) + 1);

        if (number != randomNumber) {
            System.out.printf("Ops! Número errado :( O número correto era %d.", randomNumber);
            return;
        }
        System.out.println("Parabéns! Você acertou!");
    }
}
