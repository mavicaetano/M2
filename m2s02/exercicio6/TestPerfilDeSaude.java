package m2s02.exercicio6;

import java.util.Scanner;

public class TestPerfilDeSaude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        String name = scanner.next();
        System.out.println("Informe o seu sobrenome:");
        String surname = scanner.next();
        System.out.println("Informe sua data de nascimento (dd/MM/yyy):");
        String birthDate = scanner.next();
        System.out.println("Informe o seu sexo:");
        String gender = scanner.next();
        System.out.println("Informe seu peso em kg:");
        double weight = scanner.nextDouble();
        System.out.println("Informe sua altura em metros:");
        double height = scanner.nextDouble();

        PerfilDeSaude pessoa1 = new PerfilDeSaude(name, surname, birthDate, gender, weight, height);

        System.out.printf("Perfil de saúde de %s" +
                "%nSexo: %s %nData de nascimento: %s %nAltura: %.2f %nPeso: %.1f %nIdade: %d %nIMC: %.2f " +
                "%nFrequência cardíaca alvo: %.1f-%.1f %nFrequência cardíaca máxima: %d",
                 pessoa1.fullName(), gender, birthDate, height, weight, pessoa1.calculateAge(), pessoa1.imc(),
                pessoa1.targetHeartRate()[0], pessoa1.targetHeartRate()[1], pessoa1.maxHeartRate());
    }
}
