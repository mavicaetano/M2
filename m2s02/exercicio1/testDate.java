package m2s02.exercicio1;

import java.util.Scanner;

public class testDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um ano:");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite um mês:");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite um dia:");
        int day = Integer.parseInt(scanner.nextLine());

        Date newDate = new Date(day, month, year);
        System.out.println(newDate.showDate());
    }
}
