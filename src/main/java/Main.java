import entity.EmailInfo;

public class Main {
    public static void main(String[] args) {

        EmailInfo emailInfo = new EmailInfo("joao.silva23@yahoo.com.br");

        System.out.println("Email valido?: "+emailInfo.isValidEmail());
        System.out.println("Usuario: "+emailInfo.getUsername());
        System.out.println("Dominio: "+emailInfo.getDomain());
        System.out.println("Brasileiro: " + (emailInfo.isEmailBrazilian() ? "Sim" : "Não"));


        EmailInfo emailInfo1 = new EmailInfo("maria123@gmail.com");
        System.out.println(emailInfo1.isValidEmail());
        System.out.println("Usuario: "+emailInfo1.getUsername());
        System.out.println("Dominio: "+emailInfo1.getDomain());
        System.out.println("Brasileiro: " + (emailInfo1.isEmailBrazilian() ? "Sim" : "Não"));

    }

}