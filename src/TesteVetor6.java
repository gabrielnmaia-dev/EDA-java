void main() {
    Vetor vetor = new Vetor(10);

    vetor.add("Java");
    vetor.add("Python");
    vetor.add("C++");
    vetor.add("JavaScript");

    System.out.println("Vetor original:");
    System.out.println(vetor);

// substituindo elemento existente
    boolean resultado1 = vetor.substituir("Python", "Go");

    System.out.println("\nTentando substituir 'Python' por 'Go':");
    System.out.println("Resultado: " + resultado1);
    System.out.println(vetor);

// tentando substituir elemento inexistente
    boolean resultado2 = vetor.substituir("PHP", "Rust");

    System.out.println("\nTentando substituir 'PHP' por 'Rust':");
    System.out.println("Resultado: " + resultado2);
    System.out.println(vetor);

}

