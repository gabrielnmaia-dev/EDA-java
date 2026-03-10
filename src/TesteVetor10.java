void main() {
    Vetor vetor = new Vetor(10);

    vetor.add("A");
    vetor.add("B");
    vetor.add("B");
    vetor.add("C");
    vetor.add("B");

    System.out.println("Antes:");
    System.out.println(vetor);

    vetor.removerTodos("B");

    System.out.println("Depois:");
    System.out.println(vetor);
}