// =====================================================
// EXERCÍCIOS DE MAPA - EDA
// =====================================================

public class ExerciciosMapa {

    void main() {

        // -----------------------------------------------
        // Exercício 1 — Sistema de alunos
        // Chave: matrícula (Integer) | Valor: nome (String)
        // -----------------------------------------------
        System.out.println("=== Exercício 1 - Sistema de Alunos ===");
        Mapa<Integer, String> alunos = new Mapa<>();

        alunos.put(1001, "Ana Paula");
        alunos.put(1002, "Bruno Silva");
        alunos.put(1003, "Carlos Eduardo");
        alunos.put(1004, "Diana Ferreira");
        alunos.put(1005, "Eduardo Costa");

        System.out.println("Todos os alunos:");
        alunos.exibirTodos();

        System.out.println("\nBuscar matrícula 1003: " + alunos.get(1003));

        alunos.remove(1002);
        System.out.println("\nApós remover matrícula 1002:");
        alunos.exibirTodos();

        // -----------------------------------------------
        // Exercício 2 — Contador de palavras
        // -----------------------------------------------
        System.out.println("\n=== Exercício 2 - Contador de Palavras ===");
        String frase = "java java mapa lista mapa mapa";
        String[] palavras = frase.split(" ");

        Mapa<String, Integer> contador = new Mapa<>();
        for (String palavra : palavras) {
            Integer count = contador.get(palavra);
            if (count == null) {
                contador.put(palavra, 1);
            } else {
                contador.put(palavra, count + 1);
            }
        }

        System.out.println("Contagem de palavras:");
        contador.exibirTodos();

        // -----------------------------------------------
        // Exercício 3 — Agenda telefônica
        // Chave: nome (String) | Valor: telefone (String)
        // -----------------------------------------------
        System.out.println("\n=== Exercício 3 - Agenda Telefônica ===");
        Mapa<String, String> agenda = new Mapa<>();

        agenda.put("Alice", "(83) 99111-2222");
        agenda.put("Bob", "(83) 99333-4444");
        agenda.put("Carol", "(83) 99555-6666");
        agenda.put("David", "(83) 99777-8888");

        System.out.println("Todos os contatos:");
        agenda.exibirTodos();

        System.out.println("\nTelefone de Carol: " + agenda.get("Carol"));

        agenda.remove("Bob");
        System.out.println("\nApós remover Bob:");
        agenda.exibirTodos();

        // -----------------------------------------------
        // Exercício 4 — Controle de estoque
        // Chave: produto (String) | Valor: quantidade (Integer)
        // -----------------------------------------------
        System.out.println("\n=== Exercício 4 - Controle de Estoque ===");
        Mapa<String, Integer> estoque = new Mapa<>();

        estoque.put("Notebook", 10);
        estoque.put("Mouse", 50);
        estoque.put("Teclado", 30);
        estoque.put("Monitor", 15);
        estoque.put("Headset", 25);

        System.out.println("Estoque inicial:");
        estoque.exibirTodos();

        // Simular venda de 3 mouses
        String produtoVendido = "Mouse";
        int quantidadeVendida = 3;
        int qtdAtual = estoque.get(produtoVendido);
        estoque.put(produtoVendido, qtdAtual - quantidadeVendida);

        System.out.println("\nApós venda de " + quantidadeVendida + " " + produtoVendido + "(s):");
        estoque.exibirTodos();

        // -----------------------------------------------
        // Exercício 5 — Frequência de notas
        // -----------------------------------------------
        System.out.println("\n=== Exercício 5 - Frequência de Notas ===");
        int[] notas = {7, 8, 7, 10, 8, 7};
        Mapa<Integer, Integer> frequencia = new Mapa<>();

        for (int nota : notas) {
            Integer count = frequencia.get(nota);
            if (count == null) {
                frequencia.put(nota, 1);
            } else {
                frequencia.put(nota, count + 1);
            }
        }

        System.out.println("Frequência de notas:");
        frequencia.exibirTodos();

        // -----------------------------------------------
        // Exercício 6 — Inverter mapa
        // Chave original: Integer | Valor original: String
        // -----------------------------------------------
        System.out.println("\n=== Exercício 6 - Inverter Mapa ===");
        Mapa<Integer, String> mapaOriginal = new Mapa<>();
        mapaOriginal.put(1, "A");
        mapaOriginal.put(2, "B");
        mapaOriginal.put(3, "C");

        System.out.println("Mapa original:");
        mapaOriginal.exibirTodos();

        // Para inverter, iteramos pelas chaves conhecidas
        // (numa implementação real, teríamos método keySet/entrySet)
        Mapa<String, Integer> mapaInvertido = new Mapa<>();
        int[] chaves = {1, 2, 3};
        for (int chave : chaves) {
            String valor = mapaOriginal.get(chave);
            if (valor != null) {
                mapaInvertido.put(valor, chave);
            }
        }

        System.out.println("\nMapa invertido:");
        mapaInvertido.exibirTodos();

        // -----------------------------------------------
        // Exercício 7 — Ranking de pontuação
        // Chave: nome (String) | Valor: pontuação (Integer)
        // -----------------------------------------------
        System.out.println("\n=== Exercício 7 - Ranking de Pontuação ===");
        Mapa<String, Integer> ranking = new Mapa<>();

        ranking.put("Mario", 1500);
        ranking.put("Luigi", 1200);
        ranking.put("Peach", 1800);
        ranking.put("Toad", 900);

        System.out.println("Pontuações:");
        ranking.exibirTodos();

        // Atualizar pontuação do Mario
        ranking.put("Mario", 2000);
        System.out.println("\nApós atualizar Mario para 2000:");
        ranking.exibirTodos();

        // Encontrar jogador com maior pontuação
        // (percorremos os nomes conhecidos)
        String[] jogadores = {"Mario", "Luigi", "Peach", "Toad"};
        String melhorJogador = jogadores[0];
        int maiorPontuacao = ranking.get(jogadores[0]);

        for (String jogador : jogadores) {
            int pontuacao = ranking.get(jogador);
            if (pontuacao > maiorPontuacao) {
                maiorPontuacao = pontuacao;
                melhorJogador = jogador;
            }
        }

        System.out.println("\nJogador com maior pontuação: " + melhorJogador + " → " + maiorPontuacao);
    }
}
