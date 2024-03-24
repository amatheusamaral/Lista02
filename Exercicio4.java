import java.util.Scanner;

public class Exercicio4 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }
        
        System.out.print("Digite um número inteiro qualquer: ");
        int n = scanner.nextInt();
        
        System.out.println("Índices dos elementos inferiores a " + n + ":");
        for (int i = 0; i < 5; i++) {
            if (vetor[i] < n) {
                System.out.println(i);
            }
        }
    }

}
