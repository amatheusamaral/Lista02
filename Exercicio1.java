import java.util.Scanner;

public class Exercicio1 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        double[] vetor = new double[5];
        double soma = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextDouble();
            soma += vetor[i];
        }
        
        double media = soma / 5;
        
        System.out.println("Valores menores que a média:");
        for (double num : vetor) {
            if (num < media) {
                System.out.println(num);
            }
        }
        System.out.println("Valores iguais à média:");
        for (double num : vetor) {
            if (num == media) {
                System.out.println(num);
            }
        }
        System.out.println("Valores superiores à média:");
        for (double num : vetor) {
            if (num > media) {
                System.out.println(num);
            }
        }
    }

}
