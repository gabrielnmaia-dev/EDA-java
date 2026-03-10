void main() {
    Vetor vetor = new Vetor(5);

    vetor.add("Java");
    vetor.add("Python");
    vetor.add("C++");

    System.out.println("Antes de limpar:");
    System.out.println(vetor);

    vetor.limpar();

    System.out.println("\nDepois de limpar:");
    System.out.println(vetor);
}