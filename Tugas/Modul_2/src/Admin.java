import javax.xml.namespace.QName;

public class Admin {
    String Username;
    String Password;

    void Login(){
        if (Username.equals("Admin208")&& Password.equals("Password208")){
            System.out.println("Login Admin berhasil !");
        }else{
            System.out.println("Login Gagal ! Username atau Password salah.");
        }
    }
}
