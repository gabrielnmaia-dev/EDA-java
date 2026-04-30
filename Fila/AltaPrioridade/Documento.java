import java.util.LinkedList;
import java.util.Queue;

public class Documento {

    private String nome;
    private int paginas;
    private int prioridade; // 1=urgente, 2=normal, 3=baixa
    private int ordemChegada; // para manter ordem de chegada em mesma prioridade
    private static int contadorOrdem = 0;

    public Documento(String nome, int paginas, int prioridade) {
        this.nome = nome;
        this.paginas = paginas;
        this.prioridade = prioridade;
        this.ordemChegada = contadorOrdem++;
    }

    public String getNome() {
        return nome;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public int getOrdemChegada() {
        return ordemChegada;
    }

    @Override
    public String toString() {
        String prioridadeStr;
        switch (prioridade) {
            case 1:
                prioridadeStr = "URGENTE";
                break;
            case 2:
                prioridadeStr = "NORMAL";
                break;
            case 3:
                prioridadeStr = "BAIXA";
                break;
            default:
                prioridadeStr = "DESCONHECIDA";
        }
        return String.format("%s (%d páginas) [%s]", nome, paginas, prioridadeStr);
    }

}
