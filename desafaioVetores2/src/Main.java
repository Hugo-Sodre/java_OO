import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos pessoas voce vai digitar?");
        int n = sc.nextInt();

        String [] nomes = new String[n];
        int[] idades = new int[n];

        double[] alturas = new double[n];

        for(int i= 0; i<n; i++){
            System.out.println("Dados da " + (i+1)+ "a pessoa :");
            System.out.println("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade:");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }
    }
}