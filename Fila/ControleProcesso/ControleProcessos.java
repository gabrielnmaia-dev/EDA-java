import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ControleProcessos {

    private Queue<Processo> filaProcessos;
    private int totalProcessosExecutados;
    private int tempoTotalExecucao;

    public ControleProcessos() {
        filaProcessos = new LinkedList<>();
        totalProcessosExecutados = 0;
        tempoTotalExecucao = 0;
    }

    public void adicionarProcesso(String nome, int tempoExecucao) {
        Processo novoProcesso = new Processo(nome, tempoExecucao);
        filaProcessos.add(novoProcesso);
        System.out.println("✅ PROCESSO ADICIONADO: " + novoProcesso);
        System.out.println("   ↳ Processos na fila: " + filaProcessos.size() + "\n");
    }

    public void executarProximoProcesso() {
        if (filaProcessos.isEmpty()) {
            System.out.println("⚠️ NENHUM PROCESSO NA FILA DE EXECUÇÃO!\n");
            return;
        }

        Processo processoAtual = filaProcessos.poll();
        totalProcessosExecutados++;
        tempoTotalExecucao += processoAtual.getTempoExecucao();

        System.out.println("🔄 EXECUTANDO PROCESSO...");
        System.out.println("   ↳ " + processoAtual);
        System.out.println("   ↳ Tempo estimado: " + processoAtual.getTempoExecucao() + " segundos");

        // Simular execução do processo
        simularExecucao(processoAtual.getTempoExecucao());

        System.out.println("✅ PROCESSO FINALIZADO: " + processoAtual.getNome());
        System.out.println("   ↳ Processos restantes na fila: " + filaProcessos.size());
        System.out.println("   ↳ Total de processos executados: " + totalProcessosExecutados);
        System.out.println("   ↳ Tempo total de execução: " + tempoTotalExecucao + " segundos\n");
    }

    private void simularExecucao(int segundos) {
        try {
            for (int i = 1; i <= segundos; i++) {
                System.out.printf("   ⏳ Executando... %d/%d segundos\r", i, segundos);
                Thread.sleep(1000); // 1 segundo = 1 segundo real
            }
            System.out.println("   ✅ Execução concluída!          ");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("\n   ⚠️ Execução interrompida!");
        }
    }

    public void executarTodosProcessos() {
        if (filaProcessos.isEmpty()) {
            System.out.println("⚠️ NENHUM PROCESSO NA FILA!\n");
            return;
        }

        System.out.println("\n=== EXECUTANDO TODOS OS PROCESSOS ===\n");
        while (!filaProcessos.isEmpty()) {
            executarProximoProcesso();
        }
        System.out.println("🎉 TODOS OS PROCESSOS FORAM EXECUTADOS!\n");
    }

    public void mostrarStatus() {
        System.out.println("\n=== STATUS DO SISTEMA ===");
        System.out.println("📊 Processos executados: " + totalProcessosExecutados);
        System.out.println("⏱️  Tempo total de execução: " + tempoTotalExecucao + " segundos");
        System.out.println("📋 Processos na fila: " + filaProcessos.size());

        if (!filaProcessos.isEmpty()) {
            System.out.println("\n🔜 PRÓXIMOS PROCESSOS NA FILA (ordem de execução):");
            int posicao = 1;
            for (Processo p : filaProcessos) {
                System.out.println("   " + posicao + "º: " + p);
                posicao++;
            }
        } else {
            System.out.println("\n✅ Nenhum processo aguardando execução!");
        }
        System.out.println();
    }

    public void mostrarProcessoEmExecucao() {
        if (filaProcessos.isEmpty()) {
            System.out.println("⚠️ Nenhum processo em execução no momento!\n");
        } else {
            Processo proximo = filaProcessos.peek();
            System.out.println("🎯 PRÓXIMO PROCESSO A SER EXECUTADO:");
            System.out.println("   ↳ " + proximo);
            System.out.println("   ↳ Tempo estimado: " + proximo.getTempoExecucao() + " segundos\n");
        }

    }
}
