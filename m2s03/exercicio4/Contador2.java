package exercicio4;

public class Contador2 {

    private String frase;

    public Contador2(String frase) {
        this.frase = frase;
    }

    public int contarPalavras() {
        if (this.frase == null)
            return 0;
        String[] qtdPalavras = frase.split(" ");
        return qtdPalavras.length;
    }
}
