package m2s01;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a sua data de nascimento? Insira no formato dd/mm/aaaa");
        String birthDateStr = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(birthDateStr, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();

        if (age < 16) {
            System.out.printf("Você tem %d anos. Ainda não possui idade para votar.", age);
        } else if (age < 18 || age > 50) {
            System.out.printf(" Você tem %d anos. O voto é opcional.", age);
        } else {
            System.out.printf("Você tem %d anos. O voto é obrigatório.", age);
        }
    }
}
