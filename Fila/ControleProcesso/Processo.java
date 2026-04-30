public class Processo {

    private int id;
    private String nome;
    private int tempoExecucao; // em segundos
    private static int contadorId = 0;

    public Processo(String nome, int tempoExecucao) {
        this.id = ++contadorId;
        this.nome = nome;
        this.tempoExecucao = tempoExecucao;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getTempoExecucao() {
        return tempoExecucao;
    }

    @Override
    public String toString() {
        return String.format("Processo #%d - %s (%d segundos)", id, nome, tempoExecucao);
    }
}
