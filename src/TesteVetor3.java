void main() {

    Vetor vetor = new Vetor(5);

    // teste antes de adicionar elementos
    System.out.println("Tentando pegar último elemento do vetor vazio:");

    try {
        System.out.println(vetor.ultimo());
    } catch (IllegalStateException e) {
        System.out.println("Erro capturado: " + e.getMessage());
    }

    // adicionando elementos
    vetor.add("Java");
    vetor.add("Python");
    vetor.add("C++");

    // teste depois de adicionar
    System.out.println("\nDepois de adicionar elementos:");
    System.out.println("Último elemento: " + vetor.ultimo());

}