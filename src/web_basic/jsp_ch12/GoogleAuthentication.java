package web_basic.jsp_ch12;


import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class GoogleAuthentication extends Authenticator {
   PasswordAuthentication passAuth;
   
   public GoogleAuthentication() {
      passAuth = new PasswordAuthentication("inhan1009@gmail.com", "vlmwybvegbnlrhqo");
   }
   
   public PasswordAuthentication getPasswordAuthentication() {
      return passAuth;
   }
   

}
