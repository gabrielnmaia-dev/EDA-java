import java.util.Arrays;

public class Pilha <T>{

    private T[] elementos;
    private int tamanho;

    public Pilha (int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public void empilhar(T elemento){
        elementos[tamanho] = elemento;
        tamanho++;
    }


    public boolean estaVazia(){
        return this.tamanho == 0;
    }

    public T desempilhar(){
        if (estaVazia()){
            throw new IllegalStateException("pilha vazia");
        }

        T removido = elementos[tamanho -1 ];
        elementos[tamanho - 1] = null;
        tamanho --;

        return removido;
        
    }

    public T topo(){
        if (estaVazia()){
            return  null;
        }

        return elementos[tamanho - 1];
    }

    public int tamanho(){
        return tamanho;
    }


    @Override
    public String toString() {
        String resultado = "[";
        for (int i = 0; i < tamanho; i++) {
            resultado += elementos[i];

            if (i != tamanho - 1){
                resultado += ", ";
            }
        }
        resultado += "]";
        return resultado;
    }
}
