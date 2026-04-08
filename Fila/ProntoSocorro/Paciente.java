public class Paciente {

    private String nome;
    private int prioridade; // 1=urgente, 2=média, 3=baixa

    public Paciente(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    @Override
    public String toString() {
        String prioridadeStr;
        switch (prioridade) {
            case 1: prioridadeStr = "URGENTE"; break;
            case 2: prioridadeStr = "MÉDIA"; break;
            case 3: prioridadeStr = "BAIXA"; break;
            default: prioridadeStr = "DESCONHECIDA";
        }
        return nome + " (Prioridade " + prioridade + " - " + prioridadeStr + ")";
    }

}
