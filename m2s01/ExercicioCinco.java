package m2s01;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe as notas do semestre:");
        double grade1 = scanner.nextDouble();
        double grade2 = scanner.nextDouble();
        double grade3 = scanner.nextDouble();

        double mean = (grade1 + grade2 + grade3) / 3;

        System.out.printf("A média final é %.2f.", mean);
    }
}
