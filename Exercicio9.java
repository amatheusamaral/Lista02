import java.util.Scanner;

public class Exercicio9 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º elemento do vetor A: ");
            vetorA[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º elemento do vetor B: ");
            vetorB[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                vetorC[i] = vetorA[i];
            } else {
                vetorC[i] = vetorB[i];
            }
        }
        
        System.out.println("Vetor C (valores pares de A e ímpares de B):");
        for (int num : vetorC) {
            System.out.println(num);
        }
    }

}
