import java.util.*;

public class ModaLista {
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números você deseja inserir? ");
        int n = input.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        HashMap<Integer, Integer> contagem = new HashMap<>();
        for (int num : numeros) {
            contagem.put(num, contagem.getOrDefault(num, 0) + 1);
        }

        int maxFrequencia = Collections.max(contagem.values());

        ArrayList<Integer> modas = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : contagem.entrySet()) {
            if (entry.getValue() == maxFrequencia) {
                modas.add(entry.getKey());
            }

        if (modas.size() == 1) {
            System.out.println("A moda da lista é: " + modas.get(0));
        } else {
            System.out.println("A lista é multimodal. As modas são: " + modas);
        }

        input.close();
    }
}