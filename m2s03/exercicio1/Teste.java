package m2s03.exercicio1;

public class Teste {

    public static void main(String[] args) {

        m2s03.exercicio1.Funcionario funcionario1 = new m2s03.exercicio1.Funcionario(12345678900L, "Maria Vicente", 2500F);

        m2s03.exercicio1.Funcionario funcionario2 = new m2s03.exercicio1.Funcionario(98765432100L, "Maria Caetano", 1600F);

        funcionario1.promover(15F);
        System.out.printf("O salário de %s aumentou. O novo valor é de %.2f", funcionario1.getNomeCompleto(), funcionario1.getSalario());
    }
}
