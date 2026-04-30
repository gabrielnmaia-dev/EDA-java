void main() {
    Vetor vetor = new Vetor(10);

    vetor.add("Java");
    vetor.add("Python");
    vetor.add("Java");
    vetor.add("C++");
    vetor.add("Java");

    System.out.println("Vetor:");
    System.out.println(vetor);

    int contagem = vetor.contarOcorrencias("Java");

    System.out.println("\nQuantidade de vezes que 'Java' aparece:");
    System.out.println(contagem);
}