import java.util.Arrays; // Importa utilitário para trabalhar com arrays (usado no toString)

public class Vetor {

    // Array que vai armazenar os elementos (tipo String)
    private String[] elementos;

    // Quantidade REAL de elementos dentro do vetor
    // (diferente da capacidade do array)
    private int tamanho;


    // Construtor → cria o vetor com uma capacidade inicial
    public Vetor(int capacidade) {

        // Cria o array com o tamanho máximo definido
        this.elementos = new String[capacidade];

        // No início, não tem nenhum elemento
        this.tamanho = 0;
    }


    // Retorna quantos elementos existem de verdade no vetor
    public int getTamanho() {
        return tamanho;
    }


    // Adiciona um elemento no final do vetor
    public boolean add(String elemento) {

        // Verifica se ainda tem espaço
        if (this.tamanho < this.elementos.length) {

            // Adiciona no final (posição = tamanho atual)
            this.elementos[this.tamanho] = elemento;

            // Incrementa o tamanho (agora tem mais 1 elemento)
            this.tamanho++;

            return true;
        }

        // Se não tiver espaço → falha
        return false;
    }


    // Verifica se o vetor está vazio
    public boolean estavazia(){
        return this.tamanho == 0;
    }


    // Retorna o último elemento válido do vetor
    public String ultimo() {

        // Se estiver vazio → erro
        if (estavazia()) {
            throw new IllegalStateException("O vetor está vazio");
        }

        // Retorna o último (posição = tamanho - 1)
        return this.elementos[this.tamanho - 1];
    }


    // Imprime todos os elementos, um por linha
    public void imprimeUmPorLinha() {

        // Percorre só até o tamanho REAL (não o tamanho do array)
        for (int i = 0; i < tamanho; i++){
            System.out.println(elementos[i]);
        }
    }


    // Verifica se um elemento existe no vetor
    public boolean contem(String elemento){

        for (int i = 0; i < tamanho; i++) {

            // equals → compara conteúdo (não referência)
            if (elementos[i].equals(elemento)){
                return true;
            }
        }

        return false;
    }


    // Busca um elemento e retorna a posição dele
    public int busca(String elemento) {

        for (int i = 0; i < tamanho; i++) {

            if (elementos[i].equals(elemento)) {
                return i; // encontrou → retorna índice
            }
        }

        return -1; // não encontrou
    }


    // Limpa o vetor
    public void limpar() {

        // Não apaga os dados da memória,
        // só "ignora" eles zerando o tamanho
        this.tamanho = 0;
    }


    // Conta quantas vezes um elemento aparece
    public int contarOcorrencias(String elemento) {

        int contador = 0;

        for (int i = 0; i < tamanho; i++) {

            if (elementos[i].equals(elemento)) {
                contador++;
            }
        }

        return contador;
    }


    // Substitui a PRIMEIRA ocorrência de um elemento
    public boolean substituir(String antigo, String novo) {

        for (int i = 0; i < tamanho; i++) {

            if (elementos[i].equals(antigo)) {

                elementos[i] = novo; // troca o valor
                return true;
            }
        }

        return false;
    }


    // Remove elemento por posição
    public void remove(int posicao) {

        // Validação de posição
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        // Desloca todos os elementos para a esquerda
        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        // Limpa a última posição
        elementos[tamanho - 1] = null;

        // Diminui o tamanho
        tamanho--;
    }


    // Remove um elemento pelo valor
    public boolean removebusca(String elemento) {

        int posicao = busca(elemento);

        // Se não encontrou
        if (posicao == -1) {
            return false;
        }

        // Remove usando o método anterior
        remove(posicao);
        return true;
    }


    // Retorna o índice da ÚLTIMA ocorrência
    public int indiceUltimo(String elemento) {

        // Começa de trás pra frente
        for (int i = tamanho - 1; i >= 0; i--) {

            if (elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }


    // Remove TODAS as ocorrências de um elemento
    public void removerTodos(String elemento) {

        // Continua removendo enquanto encontrar
        while (removebusca(elemento)) {

            // loop vazio de propósito
        }
    }


    // Adiciona apenas se não existir
    public boolean adicionarSeNaoExiste(String elemento) {

        if (contem(elemento)) {
            return false;
        }

        add(elemento);
        return true;
    }


    // Insere um elemento DEPOIS de outro
    public boolean inserirDepois(String referencia, String novoElemento) {

        int pos = busca(referencia);

        // Se não encontrou referência
        if (pos == -1) {
            return false;
        }

        // Move elementos para a direita
        for (int i = tamanho; i > pos + 1; i--) {
            elementos[i] = elementos[i - 1];
        }

        // Insere o novo elemento
        elementos[pos + 1] = novoElemento;

        tamanho++;

        return true;
    }


    // Representação em string do vetor
    @Override
    public String toString() {
        return "Vetor{" +
                "elementos=" + Arrays.toString(elementos) +
                ", tamanho=" + tamanho +
                '}';
    }
}