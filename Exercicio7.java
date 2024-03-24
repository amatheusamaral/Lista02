import java.util.Scanner;

public class Exercicio7 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º elemento do vetor A: ");
            vetorA[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º elemento do vetor B: ");
            vetorB[i] = scanner.nextInt();
        }
        
        boolean iguais = true;
        for (int i = 0; i < 5; i++) {
            if (vetorA[i] != vetorB[i]) {
                iguais = false;
                break;
            }
        }
        
        if (iguais) {
            System.out.println("Os vetores A e B são iguais.");
        } else {
            System.out.println("Os vetores A e B são diferentes.");
        }
    }

}
