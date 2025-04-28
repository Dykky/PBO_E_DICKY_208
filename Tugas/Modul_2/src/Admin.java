import javax.xml.namespace.QName;

public class Admin { //membuat class Admin
    String Username; //variabel untuk menyimpan username user
    String Password; //variabel untuk menyimpan password user

    void Login(){ //method untuk menyimpan info login user
        if (Username.equalsIgnoreCase("Admin208")&& Password.equals("Password208")){ //data login user untuk mengecek benar dan salahnya login admin
            System.out.println("Login Admin berhasil !"); //output jika login admin benar
        }else{
            System.out.println("Login Gagal ! Username atau Password salah.");//output jika login admin salah
        }
    }
}
