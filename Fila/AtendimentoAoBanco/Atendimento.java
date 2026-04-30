void main() {
    Queue<Cliente> fila = new LinkedList<>();

    // Enfileirando 6 clientes
    fila.add(new Cliente("João", 1));
    fila.add(new Cliente("Maria", 2));
    fila.add(new Cliente("Pedro", 3));
    fila.add(new Cliente("Ana", 4));
    fila.add(new Cliente("Lucas", 5));
    fila.add(new Cliente("Carla", 6));

    System.out.println("Atendimento iniciado...\n");

    // Atendimento
    while (!fila.isEmpty()) {
        Cliente atual = fila.poll();
        System.out.println("Chamando senha: " + atual.senha + " - Cliente: " + atual.nome);
    }

    System.out.println("\nFila vazia. Todos atendidos.");
}