public class Exercicio12 {

    public static void executar() {
        int[] vetor = {0, 5, 8, 1, -6, 4, -7, 9, 10, -14, 3, 12};
        
        int produto = 1;
        for (int num : vetor) {
            if (num > 0 && num % 2 == 0) {
                produto *= num;
            }
        }
        
        System.out.println("O produto dos elementos pares positivos é: " + produto);
    }

}
