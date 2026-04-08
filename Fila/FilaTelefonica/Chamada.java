public class Chamada {

    private String nome;
    private String assunto;
    private static int contadorId = 0;
    private int id;

    public Chamada(String nome, String assunto) {
        this.nome = nome;
        this.assunto = assunto;
        this.id = ++contadorId;
    }

    public String getNome() {
        return nome;
    }

    public String getAssunto() {
        return assunto;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Chamada #%d - %s: \"%s\"", id, nome, assunto);
    }
}


