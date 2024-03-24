import java.util.Scanner;

public class Exercicio5 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }
        
        System.out.print("Digite um número inteiro qualquer: ");
        int n = scanner.nextInt();
        
        int count = 0;
        for (int num : vetor) {
            if (num == n) {
                count++;
            }
        }
        
        System.out.println("O número " + n + " aparece " + count + " vezes no vetor.");
    }

}
