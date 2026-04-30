void main() {
    Vetor vetor = new Vetor(10);

    vetor.add("A");
    vetor.add("B");
    vetor.add("C");
    vetor.add("B");
    vetor.add("D");

    System.out.println("Vetor inicial:");
    System.out.println(vetor);

    vetor.removebusca("B");

    System.out.println("\nApós remover B:");
    System.out.println(vetor);

    boolean resultado = vetor.removebusca("X");

    System.out.println("\nTentando remover X:");
    System.out.println("Resultado: " + resultado);
    System.out.println(vetor);
}