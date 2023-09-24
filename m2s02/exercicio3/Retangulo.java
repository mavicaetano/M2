package m2s02.exercicio3;

public class Retangulo {
    private double lenght = 1;
    private double width = 1;

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        if (lenght > 0 && lenght < 20) {
            this.lenght = lenght;
        } else {
            System.out.println("Erro: insira um valor entre 0 e 20!");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0 && width < 20) {
            this.width = width;
        } else {
            System.out.println("Erro: insira um valor entre 0 e 20!");
        }
    }

    public double perimeter() {
        return (this.lenght + this.width) * 2;
    }

    public double area() {
        return this.lenght * this.width;
    }
}
