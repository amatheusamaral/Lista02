import java.util.Scanner;

public class Exercicio13 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
        int n = scanner.nextInt();
        
        int[] fibonacci = new int[n];
        
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        
        System.out.println("Sequência de Fibonacci com " + n + " termos:");
        for (int num : fibonacci) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
