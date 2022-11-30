import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // FACA UM PROGRAMA QUE LEIA UMA NOTA ENTRE 1 E 10 - CASO O VALOR ESTEJA FORA DISSO, REPITA A LEITURA.
        /* Scanner scan = new Scanner(System.in);


        System.out.println("Digite uma nota entre 0 e 10: ");
        int nota = scan.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("Digite uma nota válida: ");
            nota = scan.nextInt();

        }
        System.out.println("Obrigado! Finalizando o programa..."); */

        //==============================================================================//

        // LEIA 5 NÚMEROS - MOSTRE QUAL O MAIOR ENTRE ELES E QUAL A MÉDIA.
        /* Scanner scan = new Scanner(System.in);

        int count = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.println("Digite um valor: ");
            int n = scan.nextInt();

            if (n > maior) {
                maior = n;
            }

            soma = soma + n;
            count++;

        } while (count < 5);

        System.out.println("O maior valor foi: " + maior);
        System.out.println("A soma de todos os números é: " + soma);
        System.out.println("a média dos valores foi: " + soma / 5); */

        //==============================================================================//

        // COLETE ALGUNS NÚMEROS E MOSTRE QUANTOS FORAM PARES E QUANTOS FORAM ÍMPARES.
        /* Scanner scan = new Scanner(System.in);

        int qtd = 0, imp = 0, par = 0, count = 0, n = 0;

        System.out.println("Quantos valores você quer ler? ");
        qtd = scan.nextInt();

        do {
            System.out.println("Digite um valor: ");
            n = scan.nextInt();

            if (n % 2 == 0) {
                par++;
            }else {
                imp++;
            }

            count++;
        } while (count < qtd);

        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números ímpares: " + imp); */

        //==============================================================================//

        // LER UM NÚMERO E EFETUAR A TABUADA DELE.
        /* Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int tabuada = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + tabuada*i);
        } */

        //==============================================================================//

        // LER UM NÚMERO E EFETUAR O FATORIAL DELE.
        /* Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int fat = scan.nextInt();

        int m = 1;

        for (int i = fat; i >= 1; i--) {
            m = m * i;
        }

        System.out.println(fat + "!= " + m); */

    }
}
