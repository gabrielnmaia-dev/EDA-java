//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Pilha pilha = new Pilha(5);
    pilha.empilhar("A");
    pilha.empilhar("B");
    pilha.empilhar("C");


    System.out.println(pilha.topo());

    System.out.println(pilha.desempilhar());

    System.out.println(pilha.topo());




}
