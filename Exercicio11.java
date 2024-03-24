public class Exercicio11 {

    public static void executar() {
        int[] vetorA = {0, 2, 4, 6, 8};
        int[] vetorB = {1, 3, 5, 7, 9};
        
        int produtoEscalar = 0;
        for (int i = 0; i < 5; i++) {
            produtoEscalar += vetorA[i] * vetorB[i];
        }
        
        System.out.println("O produto escalar entre os dois vetores é: " + produtoEscalar);
    }

}
