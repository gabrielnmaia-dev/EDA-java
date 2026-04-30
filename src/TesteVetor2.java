void main() {


            Vetor vetor = new Vetor(10);

            vetor.add("Java");
            vetor.add("Python");
            vetor.add("C++");
            vetor.add("JavaScript");

            System.out.println("Vetor:");
            System.out.println(vetor);

            System.out.println("\nTestando busca por posição:");

            System.out.println("Posição 0: " + vetor.busca(0));
            System.out.println("Posição 2: " + vetor.busca(2));

            System.out.println("\nTestando contem:");

            System.out.println("Contém Java? " + vetor.contem("Java"));
            System.out.println("Contém PHP? " + vetor.contem("PHP"));


    }
