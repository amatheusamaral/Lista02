import java.util.Scanner;

public class Exercicio3 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        double[] vetor1 = new double[5];
        double[] vetor2 = new double[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número do primeiro vetor: ");
            vetor1[i] = scanner.nextDouble();
        }
        
        for (int i = 0; i < 5; i++) {
            vetor2[i] = 2 * vetor1[i];
        }
        
        System.out.println("Valores do segundo vetor (dobro do primeiro vetor):");
        for (double num : vetor2) {
            System.out.println(num);
        }
    }

}
