import java.util.Scanner;

public class Exercicio8 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[10];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º elemento do vetor A: ");
            vetorA[i] = scanner.nextInt();
            vetorC[i] = vetorA[i];
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º elemento do vetor B: ");
            vetorB[i] = scanner.nextInt();
            vetorC[i + 5] = vetorB[i];
        }
        
        System.out.println("Vetor C (concatenação de A e B):");
        for (int i = 0; i < 10; i++) {
            System.out.println("C[" + i + "] = " + vetorC[i]);
        }
    }

}
