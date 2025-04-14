public class User {
    private String Nama;
    private String Nim;

    public User(String nama, String nim) {
        Nama = nama;
        Nim = nim;
    }

    public String getNama() {
        return Nama;
    }

    public String getNim() {
        return Nim;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public void setNim(String nim) {
        Nim = nim;
    }

    void Login(){
        System.out.println("Sistem Login Belum Ditambahkan");
    }

    void DisplayInfo() {
        System.out.println("Sistem info Belum ditambahkan");
    }
}