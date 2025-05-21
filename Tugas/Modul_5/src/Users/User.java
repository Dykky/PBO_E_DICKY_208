package Users;

public abstract class User {
    private String Nama;
    private String Nim;

    public User(String Nama, String Nim){
        this.Nama = Nama;
        this.Nim = Nim;
    }

    public String getNama(){
        return Nama;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public String getNim(){
        return Nim;
    }

    public void setNim(String Nim){
        this.Nim = Nim;
    }

    public abstract void login();

    public void DisplayInfo(){
        System.out.println("Nama = " + getNama());
        System.out.println("Nim = " + getNim());
    }

public abstract void DisplayAppMenu();
}
