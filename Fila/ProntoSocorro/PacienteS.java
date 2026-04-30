void main() {
    PriorityQueue<Paciente> fila = new PriorityQueue<>(
            Comparator.comparingInt(Paciente::getPrioridade)
    );

    // Enfileirar 6 pacientes
    System.out.println("=== ENFILEIRANDO PACIENTES ===\n");

    Paciente p1 = new Paciente("João Silva", 2);
    Paciente p2 = new Paciente("Maria Santos", 1);
    Paciente p3 = new Paciente("Carlos Souza", 3);
    Paciente p4 = new Paciente("Ana Oliveira", 1);
    Paciente p5 = new Paciente("Pedro Costa", 2);
    Paciente p6 = new Paciente("Lucia Ferreira", 3);

    fila.add(p1);
    System.out.println("Enfileirado: " + p1);

    fila.add(p2);
    System.out.println("Enfileirado: " + p2);

    fila.add(p3);
    System.out.println("Enfileirado: " + p3);

    fila.add(p4);
    System.out.println("Enfileirado: " + p4);

    fila.add(p5);
    System.out.println("Enfileirado: " + p5);

    fila.add(p6);
    System.out.println("Enfileirado: " + p6);

    // Mostrar a fila organizada (sem remover)
    System.out.println("\n=== FILA ORGANIZADA (ordem de prioridade) ===");
    PriorityQueue<Paciente> filaTemp = new PriorityQueue<>(fila);
    int posicao = 1;
    while (!filaTemp.isEmpty()) {
        System.out.println(posicao + "º: " + filaTemp.poll());
        posicao++;
    }

    // Atender os pacientes em ordem de prioridade
    System.out.println("\n=== ATENDIMENTO DOS PACIENTES ===\n");

    int atendimentoNum = 1;
    while (!fila.isEmpty()) {
        Paciente pacienteAtendido = fila.poll();
        System.out.println(atendimentoNum + "º atendimento: " + pacienteAtendido);
        atendimentoNum++;
    }

    System.out.println("\n=== FIM DO ATENDIMENTO ===");
    System.out.println("Todos os pacientes foram atendidos!");
}