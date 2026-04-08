void main() {
    Queue<ClienteMercado> fila = new LinkedList<>();

    // Enfileirar 5 clientes
    fila.add(new ClienteMercado("João", 10));
    fila.add(new ClienteMercado("Maria", 5));
    fila.add(new ClienteMercado("Pedro", 8));
    fila.add(new ClienteMercado("Ana", 3));
    fila.add(new ClienteMercado("Lucas", 12));

    System.out.println("Iniciando atendimento...\n");

    while (!fila.isEmpty()) {
        ClienteMercado atual = fila.poll();

        System.out.println("Atendendo: " + atual.nome +
                " (" + atual.produtos + " produtos)");

        System.out.println("Clientes restantes na fila: " + fila.size());
        System.out.println("----------------------");
    }

    System.out.println("Fila vazia.");
}