import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        conta Conta ;
        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.println("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y'){
            System.out.println("Enter value for initial deposit");
            double initialDeposit =sc.nextInt();
            Conta = new conta(number, holder, initialDeposit);
        }
        else {
            Conta = new conta(number, holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(Conta.toString());


    }
}