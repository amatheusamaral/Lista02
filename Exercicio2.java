import java.util.Scanner;

public class Exercicio2 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
            if (vetor[i] > 0) {
                System.out.println("O número " + vetor[i] + " é positivo.");
            } else if (vetor[i] < 0) {
                System.out.println("O número " + vetor[i] + " é negativo.");
            } else {
                System.out.println("O número é zero.");
            }
        }
    }

}
