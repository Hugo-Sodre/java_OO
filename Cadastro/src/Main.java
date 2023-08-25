import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pessoa p1 = new pessoa();

        System.out.print("Digite o nome da pessoa: ");
        String nome = sc.nextLine();


        p1.setNome(nome);

        System.out.print("Digite a Idade da pessoa: ");
        int idade = sc.nextInt();

        System.out.print("Digite o sexo da pessoa  M/F: ");
        String sexo = sc.nextLine();






        sc.close();
    }
    }