package m2s01;

import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe qual o salário do funcionário (apenas números e vírgula):");
        double wage = scanner.nextDouble();
        double newWage = 0;
        double wageDifference = newWage - wage;
        String increase = "";

        if (wage <= 1200) {
            wageDifference = wage * 0.2;
            newWage = wage + wageDifference;
            increase = "20%";
        } else if (wage > 1200 && wage <= 1700) {
            wageDifference = wage * 0.15;
            newWage = wage + wageDifference;
            increase = "15%";
        } else if (wage > 1700 && wage < 2500) {
            wageDifference = wage * 0.1;
            newWage = wage + wageDifference;
            increase = "10%";
        } else {
            wageDifference = wage * 0.05;
            newWage = wage + wageDifference;
            increase = "5%";
        }

        System.out.printf("Seu salário era de R$%.2f e teve um reajuste de %s, passando a ser de R$%.2f." +
                "\nVocê obteve um aumento de R$%.2f.", wage, increase, newWage, wageDifference);
    }
}
