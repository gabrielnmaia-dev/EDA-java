// =====================================================
// EXERCÍCIOS DE LISTA ENCADEADA - EDA
// =====================================================

// -----------------------------------------------
// Classes de modelo usadas nos exercícios
// -----------------------------------------------

class Aluno {
    String nome;
    int matricula;

    Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{nome='" + nome + "', matricula=" + matricula + "}";
    }
}

class Musica {
    String titulo;
    String artista;

    Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "'" + titulo + "' - " + artista;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Musica)) return false;
        Musica other = (Musica) obj;
        return this.titulo.equals(other.titulo) && this.artista.equals(other.artista);
    }
}

class ItemCompra {
    String produto;
    int quantidade;

    ItemCompra(String produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return produto + " (qtd: " + quantidade + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ItemCompra)) return false;
        return this.produto.equals(((ItemCompra) obj).produto);
    }
}

class Livro {
    String titulo;
    String autor;
    int anoPublicacao;

    Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "\"" + titulo + "\" de " + autor + " (" + anoPublicacao + ")";
    }
}

class PaginaWeb {
    String titulo;
    String endereco;

    PaginaWeb(String titulo, String endereco) {
        this.titulo = titulo;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return titulo + " [" + endereco + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PaginaWeb)) return false;
        return this.endereco.equals(((PaginaWeb) obj).endereco);
    }
}

class Convidado {
    String nome;
    String cpf;

    Convidado(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return nome + " (CPF: " + cpf + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Convidado)) return false;
        return this.cpf.equals(((Convidado) obj).cpf);
    }
}

class Produto {
    String nome;
    double preco;
    int quantidadeEstoque;

    Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return nome + " - R$" + String.format("%.2f", preco) + " (estoque: " + quantidadeEstoque + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Produto)) return false;
        return this.nome.equals(((Produto) obj).nome);
    }
}

class Contato {
    String nome;
    String telefone;

    Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return nome + " → " + telefone;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Contato)) return false;
        return this.nome.equals(((Contato) obj).nome);
    }
}

class Disciplina {
    String nome;
    double notaFinal;

    Disciplina(String nome, double notaFinal) {
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return nome + " → Nota: " + notaFinal;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Disciplina)) return false;
        return this.nome.equals(((Disciplina) obj).nome);
    }
}

class Carro {
    String placa;
    String modelo;

    Carro(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return modelo + " [" + placa + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Carro)) return false;
        return this.placa.equals(((Carro) obj).placa);
    }
}


// =====================================================
// CLASSE PRINCIPAL COM OS 10 EXERCÍCIOS
// =====================================================
public class ExerciciosListaEncadeada {

    void main() {

        // -----------------------------------------------
        // Exercício 1 — Lista de chamada da turma
        // -----------------------------------------------
        System.out.println("=== Exercício 1 - Lista de Chamada ===");
        ListaEncadeada<Aluno> chamada = new ListaEncadeada<>();
        chamada.adiciona(new Aluno("Ana", 1001));
        chamada.adiciona(new Aluno("Bruno", 1002));
        chamada.adiciona(new Aluno("Carlos", 1003));
        chamada.adiciona(new Aluno("Diana", 1004));
        chamada.adiciona(new Aluno("Eduardo", 1005));

        System.out.println("Todos os alunos: " + chamada);
        System.out.println("Primeiro: " + chamada.pegaPrimeiro());
        System.out.println("Último: " + chamada.pegaUltimo());
        System.out.println("Total de alunos: " + chamada.getTamanho());

        // -----------------------------------------------
        // Exercício 2 — Playlist de músicas
        // -----------------------------------------------
        System.out.println("\n=== Exercício 2 - Playlist ===");
        ListaEncadeada<Musica> playlist = new ListaEncadeada<>();
        playlist.adiciona(new Musica("Bohemian Rhapsody", "Queen"));
        playlist.adiciona(new Musica("Stairway to Heaven", "Led Zeppelin"));
        playlist.adiciona(new Musica("Smells Like Teen Spirit", "Nirvana"));
        playlist.adiciona(new Musica("Hotel California", "Eagles"));
        playlist.adiciona(new Musica("Imagine", "John Lennon"));
        playlist.adiciona(new Musica("Purple Rain", "Prince"));

        System.out.println("Playlist completa: " + playlist);
        Musica buscaMusica = new Musica("Imagine", "John Lennon");
        System.out.println("Contém 'Imagine'? " + playlist.contem(buscaMusica));
        System.out.println("Total de músicas: " + playlist.getTamanho());

        // -----------------------------------------------
        // Exercício 3 — Lista de compras
        // -----------------------------------------------
        System.out.println("\n=== Exercício 3 - Lista de Compras ===");
        ListaEncadeada<ItemCompra> compras = new ListaEncadeada<>();
        compras.adiciona(new ItemCompra("Arroz", 2));
        compras.adiciona(new ItemCompra("Feijão", 1));
        compras.adiciona(new ItemCompra("Macarrão", 3));
        compras.adiciona(new ItemCompra("Frango", 2));
        compras.adiciona(new ItemCompra("Óleo", 1));
        compras.adiciona(new ItemCompra("Sal", 1));
        compras.adiciona(new ItemCompra("Açúcar", 2));

        System.out.println("Lista de compras: " + compras);
        System.out.println("Item na posição 2: " + compras.pega(2));
        System.out.println("Contém 'Frango'? " + compras.contem(new ItemCompra("Frango", 0)));
        System.out.println("Total de itens: " + compras.getTamanho());

        // -----------------------------------------------
        // Exercício 4 — Catálogo de livros
        // -----------------------------------------------
        System.out.println("\n=== Exercício 4 - Catálogo de Livros ===");
        ListaEncadeada<Livro> catalogo = new ListaEncadeada<>();
        catalogo.adiciona(new Livro("Clean Code", "Robert C. Martin", 2008));
        catalogo.adiciona(new Livro("The Pragmatic Programmer", "Andrew Hunt", 1999));
        catalogo.adiciona(new Livro("Design Patterns", "Gang of Four", 1994));
        catalogo.adiciona(new Livro("Estrutura de Dados em Java", "Michael Goodrich", 2014));
        catalogo.adiciona(new Livro("Algoritmos", "Thomas Cormen", 2009));

        System.out.println("Todos os livros: " + catalogo);
        System.out.println("Primeiro: " + catalogo.pegaPrimeiro());
        System.out.println("Último: " + catalogo.pegaUltimo());

        // -----------------------------------------------
        // Exercício 5 — Histórico de navegação
        // -----------------------------------------------
        System.out.println("\n=== Exercício 5 - Histórico de Navegação ===");
        ListaEncadeada<PaginaWeb> historico = new ListaEncadeada<>();
        historico.adiciona(new PaginaWeb("Google", "https://www.google.com"));
        historico.adiciona(new PaginaWeb("GitHub", "https://www.github.com"));
        historico.adiciona(new PaginaWeb("Stack Overflow", "https://stackoverflow.com"));
        historico.adiciona(new PaginaWeb("YouTube", "https://www.youtube.com"));
        historico.adiciona(new PaginaWeb("Wikipedia", "https://www.wikipedia.org"));
        historico.adiciona(new PaginaWeb("Oracle Docs", "https://docs.oracle.com"));
        historico.adiciona(new PaginaWeb("Alura", "https://www.alura.com.br"));
        historico.adiciona(new PaginaWeb("DevDocs", "https://devdocs.io"));

        System.out.println("Histórico: " + historico);
        PaginaWeb buscaPagina = new PaginaWeb("", "https://stackoverflow.com");
        System.out.println("Visitou Stack Overflow? " + historico.contem(buscaPagina));
        System.out.println("Última visitada: " + historico.pegaUltimo());
        System.out.println("Total de páginas: " + historico.getTamanho());

        // -----------------------------------------------
        // Exercício 6 — Lista de convidados
        // -----------------------------------------------
        System.out.println("\n=== Exercício 6 - Lista de Convidados ===");
        ListaEncadeada<Convidado> convidados = new ListaEncadeada<>();
        convidados.adiciona(new Convidado("Marcos", "111.222.333-44"));
        convidados.adiciona(new Convidado("Juliana", "222.333.444-55"));
        convidados.adiciona(new Convidado("Roberto", "333.444.555-66"));
        convidados.adiciona(new Convidado("Fernanda", "444.555.666-77"));
        convidados.adiciona(new Convidado("Paulo", "555.666.777-88"));
        convidados.adiciona(new Convidado("Larissa", "666.777.888-99"));

        System.out.println("Lista de convidados: " + convidados);
        System.out.println("Roberto está na lista? " + convidados.contem(new Convidado("Roberto", "333.444.555-66")));
        System.out.println("Total de convidados: " + convidados.getTamanho());

        // -----------------------------------------------
        // Exercício 7 — Estoque de produtos
        // -----------------------------------------------
        System.out.println("\n=== Exercício 7 - Estoque de Produtos ===");
        ListaEncadeada<Produto> estoque = new ListaEncadeada<>();
        estoque.adiciona(new Produto("Notebook", 3500.00, 10));
        estoque.adiciona(new Produto("Mouse", 89.90, 50));
        estoque.adiciona(new Produto("Teclado", 149.90, 30));
        estoque.adiciona(new Produto("Monitor", 1299.00, 15));
        estoque.adiciona(new Produto("Headset", 299.00, 20));

        System.out.println("Estoque: " + estoque);
        System.out.println("Produto na posição 1: " + estoque.pega(1));
        System.out.println("Monitor em estoque? " + estoque.contem(new Produto("Monitor", 0, 0)));
        System.out.println("Primeiro produto: " + estoque.pegaPrimeiro());
        System.out.println("Último produto: " + estoque.pegaUltimo());

        // -----------------------------------------------
        // Exercício 8 — Agenda de contatos
        // -----------------------------------------------
        System.out.println("\n=== Exercício 8 - Agenda de Contatos ===");
        ListaEncadeada<Contato> agenda = new ListaEncadeada<>();
        agenda.adiciona(new Contato("Alice", "(83) 99999-1111"));
        agenda.adiciona(new Contato("Bob", "(83) 99999-2222"));
        agenda.adiciona(new Contato("Carol", "(83) 99999-3333"));
        agenda.adiciona(new Contato("David", "(83) 99999-4444"));
        agenda.adiciona(new Contato("Eva", "(83) 99999-5555"));
        agenda.adiciona(new Contato("Felipe", "(83) 99999-6666"));

        System.out.println("Agenda: " + agenda);
        System.out.println("Carol cadastrada? " + agenda.contem(new Contato("Carol", "")));
        System.out.println("Total de contatos: " + agenda.getTamanho());

        // -----------------------------------------------
        // Exercício 9 — Boletim de notas
        // -----------------------------------------------
        System.out.println("\n=== Exercício 9 - Boletim de Notas ===");
        ListaEncadeada<Disciplina> boletim = new ListaEncadeada<>();
        boletim.adiciona(new Disciplina("Estrutura de Dados", 9.5));
        boletim.adiciona(new Disciplina("Algoritmos", 8.0));
        boletim.adiciona(new Disciplina("Programação Orientada a Objetos", 7.5));
        boletim.adiciona(new Disciplina("Banco de Dados", 9.0));
        boletim.adiciona(new Disciplina("Engenharia de Software", 8.5));

        System.out.println("Boletim: " + boletim);
        System.out.println("Disciplina na posição 2: " + boletim.pega(2));
        System.out.println("Contém 'Algoritmos'? " + boletim.contem(new Disciplina("Algoritmos", 0)));
        System.out.println("Total de disciplinas: " + boletim.getTamanho());

        // -----------------------------------------------
        // Exercício 10 — Vagas de estacionamento
        // -----------------------------------------------
        System.out.println("\n=== Exercício 10 - Estacionamento ===");
        ListaEncadeada<Carro> estacionamento = new ListaEncadeada<>();
        estacionamento.adiciona(new Carro("ABC-1234", "Gol"));
        estacionamento.adiciona(new Carro("DEF-5678", "Civic"));
        estacionamento.adiciona(new Carro("GHI-9012", "HB20"));
        estacionamento.adiciona(new Carro("JKL-3456", "Corolla"));
        estacionamento.adiciona(new Carro("MNO-7890", "Onix"));

        System.out.println("Carros estacionados: " + estacionamento);
        System.out.println("Placa GHI-9012 está? " + estacionamento.contem(new Carro("GHI-9012", "")));
        System.out.println("Primeiro carro: " + estacionamento.pegaPrimeiro());
        System.out.println("Último carro: " + estacionamento.pegaUltimo());
    }
}
