void main() {
    Vetor vetor = new Vetor(10);

    vetor.add("A");
    vetor.add("B");
    vetor.add("C");
    vetor.add("B");
    vetor.add("D");
    vetor.add("B");

    System.out.println(vetor);

    int indice = vetor.indiceUltimo("B");

    System.out.println("Última posição de B: " + indice);
}