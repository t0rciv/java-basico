import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o valor a ser encontrado: ");
        int X = leitor.nextInt();

        boolean find = false;

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 

        for (int i = 0; i < elementos.length; i++) {
          if (elementos[i] == X) {
            System.out.println("Achei " + X + " na posicao " + i);
            find = true;
          }
        }
        
        String encontrado = (!find) ? "Numero " + X + " nao encontrado!" : "";
        System.out.println(encontrado);
    }
}
