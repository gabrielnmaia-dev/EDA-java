void main() {


        String palavra = "casa";
        Pilha<String> pilha = new Pilha<>(palavra.length());

        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilhar(String.valueOf(palavra.charAt(i)));
        }

        String invertida = "";

        while (!pilha.estaVazia()) {
            invertida += pilha.desempilhar();
        }

        if (palavra.equals(invertida)) {
            System.out.println("É palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }

}