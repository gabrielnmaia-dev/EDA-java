import java.util.LinkedList;
import java.util.Queue;

public class CentralTelefonica {
    private Queue<Chamada> filaEspera;
    private int totalAtendidas;

    public CentralTelefonica() {
        filaEspera = new LinkedList<>();
        totalAtendidas = 0;
    }

    public void receberChamada(String nome, String assunto) {
        Chamada novaChamada = new Chamada(nome, assunto);
        filaEspera.add(novaChamada);
        System.out.println("📞 CHAMADA RECEBIDA: " + novaChamada);
        System.out.println("   ↳ Aguardando na fila: " + filaEspera.size() + " chamada(s)\n");
    }

    public void atenderProximaChamada() {
        if (filaEspera.isEmpty()) {
            System.out.println("⚠️ NENHUMA CHAMADA NA FILA DE ESPERA!\n");
            return;
        }

        Chamada chamadaAtual = filaEspera.poll();
        totalAtendidas++;

        System.out.println("🎧 ATENDENDO CHAMADA...");
        System.out.println("   ↳ " + chamadaAtual);
        System.out.println("   ↳ Assunto: " + chamadaAtual.getAssunto());
        System.out.println("   ↳ Chamadas atendidas até agora: " + totalAtendidas);
        System.out.println("   ↳ Chamadas aguardando: " + filaEspera.size() + "\n");
    }

    public void mostrarStatus() {
        System.out.println("\n=== STATUS DA CENTRAL TELEFÔNICA ===");
        System.out.println("📊 Chamadas atendidas: " + totalAtendidas);
        System.out.println("⏳ Chamadas na fila: " + filaEspera.size());

        if (!filaEspera.isEmpty()) {
            System.out.println("\n📋 PRÓXIMAS CHAMADAS:");
            int posicao = 1;
            for (Chamada chamada : filaEspera) {
                System.out.println("   " + posicao + "º: " + chamada);
                posicao++;
            }
        } else {
            System.out.println("\n✅ Nenhuma chamada aguardando!");
        }
        System.out.println();
    }

    public void atenderTodas() {
        System.out.println("\n=== ATENDENDO TODAS AS CHAMADAS ===\n");
        while (!filaEspera.isEmpty()) {
            atenderProximaChamada();

            // Pequena pausa para simular tempo de atendimento
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("✅ Todas as chamadas foram atendidas!\n");
    }
}