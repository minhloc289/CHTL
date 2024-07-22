/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class SendEmail {

    private static final String USERNAME = "habibsarkar075@gmail.com";
    private static final String PASSWORD = "qhncchvnprulhkka"; // Mật khẩu ứng dụng

    public static void sendOTP(String emailTo, String otp) {
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); // TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(USERNAME, PASSWORD);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(USERNAME));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailTo));
            message.setSubject("Yêu cầu thay đổi mật khẩu");
            message.setText("Xin chào !\n\nAi đó đã yêu cầu đặt lại mật khẩu cho tài khoản của bạn, nếu đây không phải là bạn, vui lòng bỏ qua email này.\n\nSử dụng mã kích hoạt này để khôi phục mật khẩu của bạn: " + otp);
            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}

