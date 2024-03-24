import java.util.Scanner;

public class Exercicio10 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º elemento do vetor A: ");
            vetorA[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            vetorB[i] = vetorA[4 - i];
        }
        
        System.out.println("Vetor B (elementos de A invertidos):");
        for (int num : vetorB) {
            System.out.println(num);
        }
    }

}
