package m2s03.exercicio1;

public class Teste {

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario(12345678900L, "Maria Vicente", 2500F);

        Funcionario funcionario2 = new Funcionario(98765432100L, "Maria Caetano", 1600F);

        funcionario1.promover(15F);
        System.out.printf("O salário de %s aumentou em %f. O novo valor é de %.2f", funcionario1.getNomeCompleto(), String.format(funcionario1.promover()), );
    }
}
