void main() {


    String palavra = "HELLO";
    Pilha pilha = new Pilha(palavra.length());


    for (int i = 0; i < palavra.length(); i++) {
    pilha.empilhar(String.valueOf(palavra.charAt(i)));
    }


    String invertida = "";

    while (!pilha.estaVazia()) {
        invertida += pilha.desempilhar();
    }



    System.out.println(invertida);



}