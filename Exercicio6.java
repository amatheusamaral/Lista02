import java.util.Scanner;

public class Exercicio6 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        double[] notas = new double[5];
        double[] pesos = new double[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota do aluno: ");
            notas[i] = scanner.nextDouble();
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o peso da " + (i + 1) + "ª nota: ");
            pesos[i] = scanner.nextDouble();
        }
        
        double soma = 0;
        double somaPesos = 0;
        for (int i = 0; i < 5; i++) {
            soma += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        double mediaPonderada = soma / somaPesos;
        
        System.out.println("A média ponderada do aluno é: " + mediaPonderada);
    }

}
