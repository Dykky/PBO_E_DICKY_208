
class Admin extends User {
    private String password;
    private String username;

    public Admin(String username, String password) {
        super("Dicky Habib Putra Hidayatullah", "202410370110208");
        this.username = username;
        this.password = password;
    }

    @Override
    public void Login() {
        if (username.equals("Admin208") && password.equals("Password208")) {
            System.out.println("Login Admin berhasil!");
            System.out.println();
            DisplayInfo();
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }

    @Override
    public void DisplayInfo() {
        System.out.println("Informasi Admin:");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
        System.out.println("Username: " + username);
    }
}