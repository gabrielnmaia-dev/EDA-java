void main() {
    ControleProcessos sistema = new ControleProcessos();
    Scanner scanner = new Scanner(System.in);
    int opcao;

    System.out.println("=== SISTEMA DE CONTROLE DE PROCESSOS ===\n");
    System.out.println("Simulando execução FIFO (First-In, First-Out)\n");

    // Adicionar processos iniciais
    System.out.println("--- ADICIONANDO PROCESSOS INICIAIS ---\n");

    sistema.adicionarProcesso("Navegador Web", 3);
    sistema.adicionarProcesso("Editor de Texto", 4);
    sistema.adicionarProcesso("Antivírus", 6);
    sistema.adicionarProcesso("Player de Música", 2);
    sistema.adicionarProcesso("Compactador de Arquivos", 5);

    do {
        System.out.println("=== MENU PRINCIPAL ===");
        System.out.println("1️⃣  Adicionar novo processo");
        System.out.println("2️⃣  Executar próximo processo");
        System.out.println("3️⃣  Executar todos os processos");
        System.out.println("4️⃣  Mostrar processo em execução");
        System.out.println("5️⃣  Mostrar status do sistema");
        System.out.println("6️⃣  Sair");
        System.out.print("\nEscolha uma opção: ");

        opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer

        System.out.println();

        switch (opcao) {
            case 1:
                System.out.print("Nome do processo: ");
                String nome = scanner.nextLine();
                System.out.print("Tempo estimado (em segundos): ");
                int tempo = scanner.nextInt();
                scanner.nextLine();
                sistema.adicionarProcesso(nome, tempo);
                break;

            case 2:
                sistema.executarProximoProcesso();
                break;

            case 3:
                sistema.executarTodosProcessos();
                break;

            case 4:
                sistema.mostrarProcessoEmExecucao();
                break;

            case 5:
                sistema.mostrarStatus();
                break;

            case 6:
                System.out.println("Encerrando sistema de controle de processos...");
                System.out.println("📊 Resumo final:");
                sistema.mostrarStatus();
                break;

            default:
                System.out.println("❌ Opção inválida! Tente novamente.\n");
        }
    } while (opcao != 6);

    scanner.close();
}