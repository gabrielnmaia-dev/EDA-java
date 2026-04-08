void Atendimento() {

        Queue<ClienteMercado> fila = new LinkedList<>();

        // Enfileirando 6 clientes
        fila.add(new ClienteMercado("João", 1));
        fila.add(new ClienteMercado("Maria", 2));
        fila.add(new ClienteMercado("Pedro", 3));
        fila.add(new ClienteMercado("Ana", 4));
        fila.add(new ClienteMercado("Lucas", 5));
        fila.add(new ClienteMercado("Carla", 6));

        System.out.println("Atendimento iniciado...\n");

        // Atendimento
        while (!fila.isEmpty()) {
            ClienteMercado atual = fila.poll();
            System.out.println("Chamando senha: " + atual.senha + " - Cliente: " + atual.nome);
        }

        System.out.println("\nFila vazia. Todos atendidos.");


}

void main() {
}