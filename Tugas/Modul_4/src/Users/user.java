package Users;

import com.sun.security.jgss.GSSUtil;

public abstract class user {
    private String Nama;
    private String Nim;

    public user(String Nama, String Nim){
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

    public abstract void Login();

    public void DisplayInfo(){
        System.out.println("Nama = " + getNama());
        System.out.println("Nim = " + getNim());
    }

    public abstract void DisplayAppMenu();

}
