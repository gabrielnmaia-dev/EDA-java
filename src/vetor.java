public class vetor {
    private String[] elementos;
    private int tamanho; //tamanho real do vetor


    public vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public int tamanho(){
        return this.tamanho;
    }

    //1 metodo para retornar true se estiver vazio
    public boolean estavazia(){
        return this.tamanho == 0;
    }

    



}
