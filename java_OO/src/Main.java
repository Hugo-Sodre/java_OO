import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static final double PI = 3.14159;
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume (radius);

        System.out.printf("Cincumference : %.2f%n", c);

        System.out.printf("Volume : %.2f%n", v);

        System.out.printf("Cincumference : %.2f%n", PI);



        sc.close();
    }


}