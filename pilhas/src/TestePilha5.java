void main() {

    String frase = "  eu  gosto  de  java  ";
    String[] palavras = frase.split(" ");

    Pilha<String> pilha = new Pilha<>(palavras.length);

    for (int i = 0; i < palavras.length; i++) {
        pilha.empilhar(palavras[i]);
    }

    String invertida = "";

    while (!pilha.estaVazia()) {
        invertida += pilha.desempilhar();

        if (!pilha.estaVazia()) {
            invertida += " ";
        }
    }

    System.out.println(invertida);
}