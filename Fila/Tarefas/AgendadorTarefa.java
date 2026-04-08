public class AgendadorTarefa {
    public static void main(String[] args) {
        PriorityQueue<Tarefa> fila = new PriorityQueue<>();

        // Enfileirando tarefas
        System.out.println("=== ADICIONANDO TAREFAS ===\n");

        fila.add(new Tarefa("Backup", 2));
        System.out.println("Adicionado: Backup [MEDIA]");

        fila.add(new Tarefa("Atualizacao", 1));
        System.out.println("Adicionado: Atualizacao [ALTA]");

        fila.add(new Tarefa("Limpeza", 3));
        System.out.println("Adicionado: Limpeza [BAIXA]");

        fila.add(new Tarefa("Antivirus", 1));
        System.out.println("Adicionado: Antivirus [ALTA]");

        fila.add(new Tarefa("Desfragmentar", 2));
        System.out.println("Adicionado: Desfragmentar [MEDIA]");

        fila.add(new Tarefa("Logs", 3));
        System.out.println("Adicionado: Logs [BAIXA]");

        // Mostrar fila ordenada antes da execucao
        System.out.println("\n=== FILA ANTES DA EXECUCAO ===");
        mostrarFila(fila);

        // Executar todas as tarefas
        System.out.println("\n=== EXECUTANDO TAREFAS ===\n");

        int contador = 1;
        while (!fila.isEmpty()) {
            System.out.println(contador + "° Executando: " + fila.peek());

            Tarefa tarefa = fila.poll();
            System.out.println("   Concluida: " + tarefa.nome);

            System.out.println("\n--- FILA APOS ESTA EXECUCAO ---");
            mostrarFila(fila);
            System.out.println();
            contador++;
        }

        System.out.println("=== TODAS AS TAREFAS FORAM EXECUTADAS ===");
    }
}