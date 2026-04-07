//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Queue<Documento> fila = new LinkedList<>();

    // Enfileirando 5 documentos
    fila.add(new Documento("Doc1", 10));
    fila.add(new Documento("Doc2", 5));
    fila.add(new Documento("Doc3", 8));
    fila.add(new Documento("Doc4", 12));
    fila.add(new Documento("Doc5", 3));

    // Mostrar fila inicial
    System.out.println("Fila inicial:");
    for (Documento d : fila) {
        System.out.println(d.nome + " - " + d.paginas + " páginas");
    }

    System.out.println("\nIniciando impressão...\n");

    // Imprimir documentos
    while (!fila.isEmpty()) {
        Documento atual = fila.poll(); // remove da fila
        System.out.println("Imprimindo: " + atual.nome + " (" + atual.paginas + " páginas)");
    }

    System.out.println("\nFila de impressão vazia.");
}

