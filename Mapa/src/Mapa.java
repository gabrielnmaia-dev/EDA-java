public class Mapa<K, V> {

    // Entrada do mapa: par chave-valor
    private static class Entrada<K, V> {
        K chave;
        V valor;

        Entrada(K chave, V valor) {
            this.chave = chave;
            this.valor = valor;
        }
    }

    private Object[] entradas;
    private int tamanho;
    private static final int CAPACIDADE_INICIAL = 10;

    public Mapa() {
        this.entradas = new Object[CAPACIDADE_INICIAL];
        this.tamanho = 0;
    }

    // Insere ou atualiza um par chave-valor
    public void put(K chave, V valor) {
        // Verifica se a chave já existe → atualiza o valor
        for (int i = 0; i < tamanho; i++) {
            Entrada<K, V> entrada = (Entrada<K, V>) entradas[i];
            if (entrada.chave.equals(chave)) {
                entrada.valor = valor;
                return;
            }
        }
        // Aumenta capacidade se necessário
        if (tamanho == entradas.length) {
            Object[] novas = new Object[entradas.length * 2];
            for (int i = 0; i < tamanho; i++) novas[i] = entradas[i];
            entradas = novas;
        }
        entradas[tamanho] = new Entrada<>(chave, valor);
        tamanho++;
    }

    // Retorna o valor associado a uma chave (null se não encontrar)
    public V get(K chave) {
        for (int i = 0; i < tamanho; i++) {
            Entrada<K, V> entrada = (Entrada<K, V>) entradas[i];
            if (entrada.chave.equals(chave)) {
                return entrada.valor;
            }
        }
        return null;
    }

    // Remove uma entrada pela chave
    public boolean remove(K chave) {
        for (int i = 0; i < tamanho; i++) {
            Entrada<K, V> entrada = (Entrada<K, V>) entradas[i];
            if (entrada.chave.equals(chave)) {
                // Desloca os elementos para fechar o buraco
                for (int j = i; j < tamanho - 1; j++) {
                    entradas[j] = entradas[j + 1];
                }
                entradas[tamanho - 1] = null;
                tamanho--;
                return true;
            }
        }
        return false;
    }

    // Verifica se uma chave existe no mapa
    public boolean contemChave(K chave) {
        return get(chave) != null;
    }

    // Retorna o tamanho do mapa
    public int getTamanho() {
        return tamanho;
    }

    // Exibe todas as chaves e valores
    public void exibirTodos() {
        for (int i = 0; i < tamanho; i++) {
            Entrada<K, V> entrada = (Entrada<K, V>) entradas[i];
            System.out.println(entrada.chave + " → " + entrada.valor);
        }
    }

    @Override
    public String toString() {
        String resultado = "{";
        for (int i = 0; i < tamanho; i++) {
            Entrada<K, V> entrada = (Entrada<K, V>) entradas[i];
            resultado += entrada.chave + "=" + entrada.valor;
            if (i < tamanho - 1) resultado += ", ";
        }
        return resultado + "}";
    }
}
