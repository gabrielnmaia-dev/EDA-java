

void Main() {

    // Fila com prioridade: menor número = maior prioridade
    // Em caso de empate, usa ordemChegada (menor = mais antigo)
    PriorityQueue<Documento> filaImpressao = new PriorityQueue<>(
            Comparator.comparingInt(Documento::getPrioridade)
                    .thenComparingInt(Documento::getOrdemChegada)
    );

    // Adicionar documentos à fila
    System.out.println("=== ADICIONANDO DOCUMENTOS À FILA ===\n");

    Documento doc1 = new Documento("Relatório Mensal", 15, 2);
    Documento doc2 = new Documento("Contrato Urgente", 5, 1);
    Documento doc3 = new Documento("Lista de Compras", 2, 3);
    Documento doc4 = new Documento("Apresentação Projeto", 30, 2);
    Documento doc5 = new Documento("Documento Fiscal", 8, 1);
    Documento doc6 = new Documento("Artigo Científico", 12, 3);
    Documento doc7 = new Documento("Nota Fiscal", 3, 2);
    Documento doc8 = new Documento("Alerta Emergencial", 1, 1);

    adicionarDocumento(filaImpressao, doc1);
    adicionarDocumento(filaImpressao, doc2);
    adicionarDocumento(filaImpressao, doc3);
    adicionarDocumento(filaImpressao, doc4);
    adicionarDocumento(filaImpressao, doc5);
    adicionarDocumento(filaImpressao, doc6);
    adicionarDocumento(filaImpressao, doc7);
    adicionarDocumento(filaImpressao, doc8);

    // Mostrar fila organizada (sem remover)
    System.out.println("\n=== FILA DE IMPRESSÃO ORGANIZADA (ordem de prioridade) ===\n");
    mostrarFilaOrdenada(filaImpressao);

    // Processar impressão
    System.out.println("\n=== PROCESSANDO IMPRESSÃO ===\n");

    int documentoNum = 1;
    while (!filaImpressao.isEmpty()) {
        Documento doc = filaImpressao.poll();
        System.out.println(documentoNum + "º documento impresso: " + doc);

        // Simular tempo de impressão baseado no número de páginas
        int tempoEstimado = doc.getPaginas() * 2; // 2 segundos por página
        System.out.println("   ↳ Impresso " + doc.getPaginas() +
                " páginas (tempo estimado: " + tempoEstimado + " segundos)\n");
        documentoNum++;
    }

    System.out.println("=== IMPRESSÃO CONCLUÍDA ===");
    System.out.println("Todos os documentos foram impressos!");
}

private static void adicionarDocumento(PriorityQueue<Documento> fila, Documento doc) {
    fila.add(doc);
    System.out.println("Adicionado: " + doc);
}

private static void mostrarFilaOrdenada(PriorityQueue<Documento> filaOriginal) {
    // Criar uma cópia da fila para não modificar a original
    PriorityQueue<Documento> filaTemp = new PriorityQueue<>(filaOriginal);
    int posicao = 1;
    while (!filaTemp.isEmpty()) {
        Documento doc = filaTemp.poll();
        System.out.println(posicao + "º: " + doc);
        posicao++;
    }
}

void main() {
}



