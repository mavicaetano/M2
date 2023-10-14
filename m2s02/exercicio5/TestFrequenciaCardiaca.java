package m2s02.exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class TestFrequenciaCardiaca {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua data de nascimento:");
        String birthDate = scanner.next();

        FrequenciaCardiaca pessoa1 = new FrequenciaCardiaca("Maria", "Vicente", birthDate);

        System.out.printf(pessoa1.getName().toUpperCase() + "%nIdade: %d anos %nFrequência cardíaca alvo: %.1f-%.1f" +
                        "%nFrequência cardíaca máxima: %d",
                pessoa1.calculateAge(), pessoa1.targetHeartRate()[0], pessoa1.targetHeartRate()[1], pessoa1.maxHeartRate());

        scanner.close();
    }
}
