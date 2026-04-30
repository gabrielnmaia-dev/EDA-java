// =====================================================
// EXERCÍCIOS DE RECURSÃO - EDA
// =====================================================

public class ExerciciosRecursao {

    // -----------------------------------------------
    // Exercício 1 - Sequência de Fibonacci
    // Retorna o N-ésimo termo da sequência Fibonacci
    // -----------------------------------------------
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // -----------------------------------------------
    // Exercício 1 - Fibonacci OTIMIZADO (memoization)
    // Desafio: evitar recalcular os mesmos subproblemas
    // -----------------------------------------------
    private static int[] memo = new int[100];

    public static int fibonacciOtimizado(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (memo[n] != 0) return memo[n];
        memo[n] = fibonacciOtimizado(n - 1) + fibonacciOtimizado(n - 2);
        return memo[n];
    }

    // -----------------------------------------------
    // Exercício 2 - Somatório de 1 até N
    // -----------------------------------------------
    public static int somatorio(int n) {
        if (n == 1) return 1;
        return n + somatorio(n - 1);
    }

    // -----------------------------------------------
    // Exercício 3 - Inversão de String
    // -----------------------------------------------
    public static String inverterString(String s) {
        if (s.isEmpty()) return s;
        return inverterString(s.substring(1)) + s.charAt(0);
    }

    // -----------------------------------------------
    // Exercício 4 - Verificação de Palíndromo
    // -----------------------------------------------
    public static boolean ehPalindromo(String s) {
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return ehPalindromo(s.substring(1, s.length() - 1));
    }

    // -----------------------------------------------
    // Exercício 5 - Soma dos elementos de um array
    // -----------------------------------------------
    public static int somaArray(int[] arr, int indice) {
        if (indice == arr.length) return 0;
        return arr[indice] + somaArray(arr, indice + 1);
    }

    // -----------------------------------------------
    // Exercício 6 - Maior elemento de um array
    // -----------------------------------------------
    public static int maiorElemento(int[] arr, int indice) {
        if (indice == arr.length - 1) return arr[indice];
        int maiorResto = maiorElemento(arr, indice + 1);
        return arr[indice] > maiorResto ? arr[indice] : maiorResto;
    }

    // -----------------------------------------------
    // Exercício 7 - Contagem de dígitos
    // -----------------------------------------------
    public static int contarDigitos(int n) {
        if (n < 10) return 1;
        return 1 + contarDigitos(n / 10);
    }


    // -----------------------------------------------
    // MAIN - testes de todos os exercícios
    // -----------------------------------------------
    void main() {

        // --- Exercício 1: Fibonacci ---
        System.out.println("=== Fibonacci ===");
        System.out.print("Sequência (0 a 10): ");
        for (int i = 0; i <= 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        System.out.println("fibonacci(7) = " + fibonacci(7)); // esperado: 13

        System.out.println("\n=== Fibonacci Otimizado ===");
        System.out.println("fibonacciOtimizado(10) = " + fibonacciOtimizado(10)); // esperado: 55

        // --- Exercício 2: Somatório ---
        System.out.println("\n=== Somatório ===");
        System.out.println("somatorio(5) = " + somatorio(5));   // esperado: 15
        System.out.println("somatorio(10) = " + somatorio(10)); // esperado: 55

        // --- Exercício 3: Inversão de String ---
        System.out.println("\n=== Inversão de String ===");
        System.out.println("inverterString(\"java\") = " + inverterString("java"));     // esperado: avaj
        System.out.println("inverterString(\"arara\") = " + inverterString("arara"));   // esperado: arara
        System.out.println("inverterString(\"hello\") = " + inverterString("hello"));   // esperado: olleh

        // --- Exercício 4: Palíndromo ---
        System.out.println("\n=== Palíndromo ===");
        System.out.println("ehPalindromo(\"arara\") = " + ehPalindromo("arara"));   // esperado: true
        System.out.println("ehPalindromo(\"java\") = " + ehPalindromo("java"));     // esperado: false
        System.out.println("ehPalindromo(\"radar\") = " + ehPalindromo("radar"));   // esperado: true

        // --- Exercício 5: Soma Array ---
        System.out.println("\n=== Soma Array ===");
        int[] arr1 = {1, 2, 3, 4};
        System.out.println("somaArray([1,2,3,4]) = " + somaArray(arr1, 0)); // esperado: 10

        // --- Exercício 6: Maior Elemento ---
        System.out.println("\n=== Maior Elemento ===");
        int[] arr2 = {3, 9, 2, 15, 7};
        System.out.println("maiorElemento([3,9,2,15,7]) = " + maiorElemento(arr2, 0)); // esperado: 15

        // --- Exercício 7: Contagem de Dígitos ---
        System.out.println("\n=== Contagem de Dígitos ===");
        System.out.println("contarDigitos(12345) = " + contarDigitos(12345)); // esperado: 5
        System.out.println("contarDigitos(7) = " + contarDigitos(7));         // esperado: 1
        System.out.println("contarDigitos(100) = " + contarDigitos(100));     // esperado: 3
    }
}
