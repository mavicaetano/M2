package exercicio3;

public class Contador {

    public static int contarPalavras(String frase) {
        if (frase == null)
            return 0;
        String[] palavras = frase.split(" ");
        return palavras.length;
    }
}
