import java.util.Scanner;

public class Exercicio15 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[5];
        
        System.out.println("Digite os 5 números:");
        vetor[0] = scanner.nextInt();
        for (int i = 1; i < 5; i++) {
            System.out.print("Digite o próximo número (maior que " + vetor[i - 1] + "): ");
            int num = scanner.nextInt();
            if (num > vetor[i - 1]) {
                vetor[i] = num;
            } else {
                System.out.println("Número inválido! Digite um número maior que " + vetor[i - 1] + ".");
                i--;
            }
        }
        
        System.out.println("Vetor preenchido:");
        for (int num : vetor) {
            System.out.println(num);
        }
    }

}
