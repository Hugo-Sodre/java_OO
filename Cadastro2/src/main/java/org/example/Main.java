package org.example;
import javax.security.auth.login.LoginContext;
import java.util.Locale;
import java.util.Scanner;

import static org.example.JavaMailApp.enviarEmail;


public class Main {
    public static void main(String[] args) {

        String destinatario = "hugoteste031@gmail.com";
        String assunto = "Enviando email com JavaMail";
        String corpo = "Enviei este email utilizando JavaMail com hugosodre031@gmail.com!";
        String remetente = "hugosodre031@gmail.com";
        String senha = "123456@";




        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int escolhaUser;
        do {
            escolhaUser = menu();


            switch (escolhaUser) {
                case 1:
                    cadUser();
                    break;
                case 2:
                    loginUser();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;

            }
        } while (escolhaUser != 3);

        enviarEmail(destinatario, assunto, corpo, remetente, senha);
    }
    public static int menu() {
        Scanner input = new Scanner(System.in);

        System.out.println("(1)Cadastro\n(2)Login\n(3)Sair");
        int escolha = input.nextInt();

        return escolha;
    }

    public static void loginUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o email cadastrado: ");
        String email = input.next();

        System.out.println("Digite a senha: ");
        String password = input.next();

        Login login = new Login(email, password);
    }

    public static void cadUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o email para ser cadastrado: ");
        String email = input.next();

        System.out.println("Digite a senha pra ser cadastrada: ");
        String password = input.next();

        Cadastro cad = new Cadastro(email, password);
    }



}


