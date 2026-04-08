void main() {
    Queue<Pessoa> filaPrioritaria = new LinkedList<>();
    Queue<Pessoa> filaNormal = new LinkedList<>();

    // Enfileirando pessoas
    filaPrioritaria.add(new Pessoa("Ana", "P"));
    filaPrioritaria.add(new Pessoa("Carlos", "P"));
    filaPrioritaria.add(new Pessoa("Marcos", "P"));
    filaPrioritaria.add(new Pessoa("Fernanda", "P"));

    filaNormal.add(new Pessoa("João", "N"));
    filaNormal.add(new Pessoa("Maria", "N"));
    filaNormal.add(new Pessoa("Pedro", "N"));

    int contadorPrioritario = 0;

    System.out.println("Ordem de atendimento:\n");

    while (!filaPrioritaria.isEmpty() || !filaNormal.isEmpty()) {

        // Regra: 3 prioritários
        if (!filaPrioritaria.isEmpty() && contadorPrioritario < 3) {
            Pessoa p = filaPrioritaria.poll();
            System.out.println("Atendendo PRIORITÁRIO: " + p.nome);
            contadorPrioritario++;

        } else if (!filaNormal.isEmpty()) {
            Pessoa p = filaNormal.poll();
            System.out.println("Atendendo NORMAL: " + p.nome);
            contadorPrioritario = 0; // reseta

        } else if (!filaPrioritaria.isEmpty()) {
            // Se só tiver prioritário
            Pessoa p = filaPrioritaria.poll();
            System.out.println("Atendendo PRIORITÁRIO: " + p.nome);
        }
    }

    System.out.println("\nAtendimento finalizado.");
}