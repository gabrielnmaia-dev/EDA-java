public class Tarefa implements Comparable<Tarefa> {
    String nome;
    int prioridade; // 1 = alta, 2 = media, 3 = baixa

    Tarefa(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Tarefa outra) {
        return Integer.compare(this.prioridade, outra.prioridade);
    }

    @Override
    public String toString() {
        String prio;
        if (prioridade == 1) prio = "ALTA";
        else if (prioridade == 2) prio = "MEDIA";
        else prio = "BAIXA";
        return nome + " [" + prio + "]";
    }
}
