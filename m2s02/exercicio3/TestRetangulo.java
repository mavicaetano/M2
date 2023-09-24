package m2s02.exercicio3;

import java.util.Scanner;

public class TestRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um valor para o comprimento de um retângulo (o valor deve estar entre 0 e 20):");
        double lenght = Double.parseDouble(scanner.nextLine());

        System.out.println("Insira um valor para a largura do retângulo (o valor deve estar entre 0 e 20):");
        double width = Double.parseDouble(scanner.nextLine());

        Retangulo rectangle = new Retangulo();
        rectangle.setLenght(lenght);
        rectangle.setWidth(width);

        System.out.printf("Perímetro: %.2f%n", rectangle.perimeter());
        System.out.printf("Área: %.2f", rectangle.area());
    }
}
