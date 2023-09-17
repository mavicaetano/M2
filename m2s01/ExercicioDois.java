package m2s01;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a sua altura?");
        double height = scanner.nextDouble();
        System.out.println("Qual o seu peso?");
        double weight = scanner.nextDouble();
        double imc = weight / (height * height);

        System.out.printf("Sua altura é %.2f, seu peso é %.2f e seu IMC é %.2f.", height, weight, imc);
    }
}
