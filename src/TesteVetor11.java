void main() {
    Vetor vetor = new Vetor(10);

    vetor.adicionarSeNaoExiste("Java");
    vetor.adicionarSeNaoExiste("Python");
    vetor.adicionarSeNaoExiste("Java");

    System.out.println(vetor);
}