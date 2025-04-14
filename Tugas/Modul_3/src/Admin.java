public class Admin extends User{
    String username;
    String Password;

    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        Password = password;
    }
    @Override
    void Login() { //method untuk menyimpan info login user
        if (username.equals("Admin208") && Password.equals("Password208")) { //data login user untuk mengecek benar dan salahnya login admin
            System.out.println("Login Admin berhasil !"); //output jika login admin benar
            DisplayInfo();
        } else {
            System.out.println("Login Gagal ! Username atau Password salah.");//output jika login admin salah
        }
    }

    @Override
    void DisplayInfo(){
        System.out.println("Data Login Admin : ");
        System.out.println("Nama : " + getNama());
        System.out.println("Nim : " + getNim());
        System.out.println("Username : " +username);

    }
}
