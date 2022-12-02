import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String[] cons = new String[6];
        int qtdCons = 0;

        for (int i = 0; i < cons.length; i++) {
            System.out.println("Letra: ");
            String letter = scan.next();

            if ( !(letter.equalsIgnoreCase("a") |
            letter.equalsIgnoreCase("e") |
            letter.equalsIgnoreCase("i") |
            letter.equalsIgnoreCase("o") |
            letter.equalsIgnoreCase("u")) ) {
                cons[i] = letter;
                qtdCons++;
            } 
        }
        
        System.out.println("Consoantes: ");
        for (String consonant : cons) {
            if (consonant != null) {
                System.out.print(consonant + " ");
            }
        }
        System.out.println("==> foram encontradas " + qtdCons + " consoantes!" );
    }
}
