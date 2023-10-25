package org.example;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class JavaMailApp {

    public static void enviarEmail(String para, String assunto, String corpo, String remetente, String senha) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("hugoteste031@gmail.com", "123456");
                    }
                });

        session.setDebug(true);

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(remetente));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(para));
            message.setSubject(assunto);
            message.setText(corpo);

            Transport.send(message);

            System.out.println("E-mail enviado com sucesso!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String destinatario = "hugosodre031@gmail.com";
        String assunto = "Enviando email com JavaMail";
        String corpo = "Enviei este email utilizando JavaMail com hugosodre031@gmail.com!";
        String remetente = "hugoteste031@gmail.com";
        String senha = "123456";

        enviarEmail(destinatario, assunto, corpo, remetente, senha);
    }
}
