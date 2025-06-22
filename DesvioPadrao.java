import java.util.Scanner;

public class DesvioPadrao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lê a quantidade de números
        System.out.print("Quantos números você deseja inserir? ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("A lista deve ter pelo menos um número.");
            return;
        }

        double[] numeros = new double[n];
        double soma = 0;

        // Lê os números e calcula a soma
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = input.nextDouble();
            soma += numeros[i];
        }

        // Calcula a média
        double media = soma / n;

        // Soma dos quadrados das diferenças
        double somaQuadrados = 0;
        for (int i = 0; i < n; i++) {
            somaQuadrados += Math.pow(numeros[i] - media, 2);
        }

        // Cálculo do desvio padrão
        double desvioPadrao = Math.sqrt(somaQuadrados / n); // Dividir por (n - 1) se for amostral

        // Exibe os resultados
        System.out.printf("A média é: %.2f\n", media);
        System.out.printf("O desvio padrão é: %.2f\n", desvioPadrao);

        input.close();
    }
}
