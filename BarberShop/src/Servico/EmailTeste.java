package Servico;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailTeste {

    public static void main(String[] args) {
         
        
        Email email = new Email(
                "Senha e Usuário Sistema Service Desk", 
                "Segue usuário e senha para acesso ao sistema de auditoria\n"+"Usuario:Beta\n"+"Senha: 123456", 
                "BetaAlpha@gmail.com");
        
        email.enviar();
        

    }
    
}
