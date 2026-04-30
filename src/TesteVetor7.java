void main() {
  Vetor vetor = new Vetor(10);

  vetor.add("A");
  vetor.add("B");
  vetor.add("C");
  vetor.add("D");
  vetor.add("E");

  System.out.println("Vetor inicial:");
  System.out.println(vetor);
  System.out.println("Tamanho: " + vetor.getTamanho());

  // remover posição 0
  vetor.remove(0);

  System.out.println("\nApós remover posição 0:");
  System.out.println(vetor);
  System.out.println("Tamanho: " + vetor.getTamanho());

  // remover posição do meio
  vetor.remove(1);

  System.out.println("\nApós remover posição do meio:");
  System.out.println(vetor);
  System.out.println("Tamanho: " + vetor.getTamanho());

  // remover última posição
  vetor.remove(vetor.getTamanho() - 1);

  System.out.println("\nApós remover última posição:");
  System.out.println(vetor);
  System.out.println("Tamanho: " + vetor.getTamanho());

  // teste de remoção inválida
  System.out.println("\nTentando remover posição inválida:");

  try {
    vetor.remove(10);
  } catch (IllegalArgumentException e) {
    System.out.println("Erro capturado: " + e.getMessage());
  }
}