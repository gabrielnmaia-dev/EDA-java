void main() {
    CentralTelefonica central = new CentralTelefonica();
    Scanner scanner = new Scanner(System.in);
    int opcao;

    System.out.println("=== CENTRAL TELEFÔNICA ===\n");

    // Enfileirando chamadas iniciais
    System.out.println("--- ENFILEIRANDO CHAMADAS RECEBIDAS ---\n");

    central.receberChamada("João Silva", "Problemas com fatura");
    central.receberChamada("Maria Oliveira", "Cancelamento de serviço");
    central.receberChamada("Carlos Santos", "Informações sobre plano");
    central.receberChamada("Ana Paula", "Reclamação sobre atendimento");
    central.receberChamada("Pedro Costa", "Contratação de novo serviço");
    central.receberChamada("Lucia Ferreira", "Dúvida sobre boleto");

    do {
        System.out.println("=== MENU PRINCIPAL ===");
        System.out.println("1️⃣  Atender próxima chamada");
        System.out.println("2️⃣  Ver status da fila");
        System.out.println("3️⃣  Receber nova chamada");
        System.out.println("4️⃣  Atender todas as chamadas");
        System.out.println("5️⃣  Sair");
        System.out.print("\nEscolha uma opção: ");

        opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer

        System.out.println();

        switch (opcao) {
            case 1:
                central.atenderProximaChamada();
                break;
            case 2:
                central.mostrarStatus();
                break;
            case 3:
                System.out.print("Nome da pessoa: ");
                String nome = scanner.nextLine();
                System.out.print("Assunto da chamada: ");
                String assunto = scanner.nextLine();
                central.receberChamada(nome, assunto);
                break;
            case 4:
                central.atenderTodas();
                break;
            case 5:
                System.out.println("Encerrando sistema...");
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.\n");
        }
    } while (opcao != 5);

    scanner.close();
}