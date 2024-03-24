import java.util.Scanner;

public class Exercicio14 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }
        
        int maior = vetor[0];
        int indiceMaior = 0;
        for (int i = 1; i < 5; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                indiceMaior = i;
            }
        }
        
        int temp = vetor[indiceMaior];
        vetor[indiceMaior] = vetor[4];
        vetor[4] = temp;
        
        System.out.println("Vetor com o maior elemento na última posição:");
        for (int num : vetor) {
            System.out.println(num);
        }
    }

}
