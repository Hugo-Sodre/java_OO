import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros você vai digitar?");
        int n = sc.nextInt();
        int negativos = 0;

        double[] vect = new double[n];

        for(int i = 0; i< vect.length; i++){
            System.out.println("Digite um número :");
            double num = sc.nextDouble();

            if( num < 0){
                vect[i] = num;
                negativos++;
            }
        }

        if (negativos > 0) {
            System.out.println("\nNúmeros negativos informados");
            for(int i = 0; i < vect.length; i++){
                if (vect[i] < 0){
                    System.out.println(vect[i]);
                }
            }
        }



    }
}