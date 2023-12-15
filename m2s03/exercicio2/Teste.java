package m2s03.exercicio2;

public class Teste {
    public static void main(String[] args) {

        m2s03.exercicio2.Funcionario funcionario = new m2s03.exercicio2.Funcionario("Maria");
        funcionario.setSalario(2600F);
        funcionario.aumentar(1320F);
        System.out.println(funcionario.getSalario());
        funcionario.aumentar(220F, 50F);
        System.out.println(funcionario.getSalario());
    }
}