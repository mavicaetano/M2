package m2s03.exercicio2;

public class Teste {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Maria");
        funcionario.setSalario(2600F);
        funcionario.setAumento(1320F);
        System.out.println(funcionario.getSalario());
        funcionario.aumentar(220F, 50F);
        System.out.println(funcionario.getSalario());
    }
}