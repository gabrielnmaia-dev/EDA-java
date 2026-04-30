void main() {

    Vetor vetor = new Vetor(10);

    vetor.add("A");
    vetor.add("C");
    vetor.add("D");

    System.out.println("Antes:");
    System.out.println(vetor);

    vetor.inserirDepois("A", "B");

    System.out.println("Depois:");
    System.out.println(vetor);
}