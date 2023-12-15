package exercicio2;

public class Funcionario {

    String name;
    float salario;

    public Funcionario(String name) {
        this.name = name;
    }
    public Funcionario(String name, float salario) {
        this.name = name;
        this.salario = salario;
    }

    public void aumentar (Float valor) {
        this.salario += valor;
    }

    public void aumentar (Float valor, Float comissao) {
        this.salario += (valor + comissao);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
