import java.util.Scanner;

public class MinimoLista {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números você deseja inserir? ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("A lista deve ter pelo menos 1 número.");
            return;
        }

        System.out.print("Digite o número 1: ");
        int minimo = input.nextInt();

        for (int i = 2; i <= n; i++) {
            System.out.print("Digite o número " + i + ": ");
            int num = input.nextInt();
            if (num < minimo) {
                minimo = num;
            }
        }

        System.out.println("O menor número da lista é: " + minimo);

        input.close();
    }
}