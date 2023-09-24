package m2s02.exercicio2;

import java.util.Scanner;

public class TestCPF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o seu CPF:");
        String numCpf = scanner.next();

        PessoaFisica cpf = new PessoaFisica(numCpf);
    }
}
