import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho; //tamanho real do vetor


    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean add(String elemento) {

        if (this.tamanho < this.elementos.length) {

            this.elementos[this.tamanho] = elemento;
            this.tamanho++;

            return true;
        }

        return false;
    }

    //1 metodo para retornar true se estiver vazio
    public boolean estavazia(){
        return this.tamanho == 0;
    }


    //2 metodo que retorna ultimo elemento valido
    public String ultimo() {
        // verificar se vetor está vazio
        if (estavazia()) {
            // se estiver → lançar exceção
            throw new IllegalStateException("O vetor está vazio");
        }

        // senão → retornar último elemento
        return this.elementos[this.tamanho - 1];
    }


    //3 metodo void imprimi um por linha
    public void imprimeUmPorLinha() {
        for (int i=0; i < tamanho; i++){
            System.out.println(elementos[i]);
        }

    }

    //4 Retorna true se o vetor contém o elemento. Caso contrário, false.
    public  boolean contem(String elemento){
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)){
                return true;
            }
        }
        return false;
    }

    //busca
    public int busca(String elemento) {

        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }

    //limpar
    public void limpar() {
        this.tamanho = 0;
    }


    //Contar ocorrencias
    public int contarOcorrencias(String elemento) {

        int contador = 0;

        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                contador++;
            }
        }

        return contador;
    }

    //substituir(String antigo, String novo)
    public boolean substituir(String antigo, String novo) {

        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(antigo)) {
                elementos[i] = novo;
                return true;
            }
        }

        return false;
    }

    //remover
    public void remove(int posicao) {

        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        elementos[tamanho - 1] = null;

        tamanho--;
    }

    public boolean removebusca(String elemento) {

        int posicao = busca(elemento);

        if (posicao == -1) {
            return false;
        }

        remove(posicao);
        return true;
    }

//    indice ultimo

    public int indiceUltimo(String elemento) {

        for (int i = tamanho - 1; i >= 0; i--) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }

        //remover todos
        public void removerTodos(String elemento) {

            while (removebusca(elemento)) {

            }

        }

//        adicionar se nao existe
        public boolean adicionarSeNaoExiste(String elemento) {

            if (contem(elemento)) {
                return false;
            }

            add(elemento);
            return true;
        }

//        inserir Depois
public boolean inserirDepois(String referencia, String novoElemento) {

    int pos = busca(referencia);

    if (pos == -1) {
        return false;
    }

    for (int i = tamanho; i > pos + 1; i--) {
        elementos[i] = elementos[i - 1];
    }

    elementos[pos + 1] = novoElemento;
    tamanho++;

    return true;
}


    @Override
    public String toString() {
        return "Vetor{" +
                "elementos=" + Arrays.toString(elementos) +
                ", tamanho=" + tamanho +
                '}';
    }
}
