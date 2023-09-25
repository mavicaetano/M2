package m2s02.exercicio4;

import java.util.Scanner;

public class TestFatura {
    public static void main(String[] args) {

        Fatura fatura1 = new Fatura("001", "Teclado", 2, 149.99);

        System.out.println("Fatura nº " + fatura1.getNumber());
        System.out.println("Produto: " + fatura1.getDescription());
        System.out.println("Quantidade: " + fatura1.getQuantity());
        System.out.println("Preço unitário: " + fatura1.getPriceForItem());
        System.out.println("Valor total da fatura: " + fatura1.getValorFatura());
    }
}
