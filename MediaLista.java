import java.util.Scanner;

public class MediaLista {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números você deseja inserir? ");

        int n = input.nextInt();

        double[] numeros = new double[n];

        double soma = 0;

        for (int i = 0; i < n; i++) {
            
            System.out.print("Digite o número " + (i + 1) + ": ");

            numeros[i] = input.nextDouble();

            soma += numeros[i];
        }

        double media = soma / n;

        System.out.printf("A média dos números é: %.2f\n", media);

        input.close();
    }
}
