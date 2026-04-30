public class ListaEncadeada<T> {

    // Nó interno da lista
    private class No {
        T dado;
        No proximo;

        No(T dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    private No cabeca;
    private int tamanho;

    public ListaEncadeada() {
        this.cabeca = null;
        this.tamanho = 0;
    }

    // Adiciona elemento no final da lista
    public void adiciona(T elemento) {
        No novo = new No(elemento);
        if (cabeca == null) {
            cabeca = novo;
        } else {
            No atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
        tamanho++;
    }

    // Retorna elemento em determinada posição (0-indexado)
    public T pega(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido: " + indice);
        }
        No atual = cabeca;
        for (int i = 0; i < indice; i++) {
            atual = atual.proximo;
        }
        return atual.dado;
    }

    // Retorna o primeiro elemento
    public T pegaPrimeiro() {
        if (cabeca == null) throw new IllegalStateException("Lista vazia");
        return cabeca.dado;
    }

    // Retorna o último elemento
    public T pegaUltimo() {
        if (cabeca == null) throw new IllegalStateException("Lista vazia");
        No atual = cabeca;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }
        return atual.dado;
    }

    // Verifica se a lista contém determinado elemento (usa equals)
    public boolean contem(T elemento) {
        No atual = cabeca;
        while (atual != null) {
            if (atual.dado.equals(elemento)) return true;
            atual = atual.proximo;
        }
        return false;
    }

    // Retorna o tamanho da lista
    public int getTamanho() {
        return tamanho;
    }

    // Representação em texto da lista
    @Override
    public String toString() {
        String resultado = "[";
        No atual = cabeca;
        while (atual != null) {
            resultado += atual.dado;
            if (atual.proximo != null) resultado += " -> ";
            atual = atual.proximo;
        }
        resultado += "]";
        return resultado;
    }
}
