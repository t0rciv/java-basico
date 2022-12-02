public class App {
    public static void main(String[] args) throws Exception {
        // CRIAR UM ARRAY COM 5 VALORES E IMPRIMIR INVERTENDO A ORDEM.

        int[] vetor = {2, 4, 6, 10, 22};

        System.out.print("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.print("\nVetor: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
