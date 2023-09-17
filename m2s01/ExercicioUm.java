package m2s01;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu sobrenome?");
        String lastName = scanner.next();
        System.out.println("Qual o seu nome?");
        String firstName = scanner.next();
        String name = firstName + " " + lastName;
        int nameLenght = name.length();
        System.out.printf("Seu nome completo é %s e possui %d letras.", name, nameLenght-1);

    }
}
