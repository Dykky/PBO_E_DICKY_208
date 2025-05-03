package Perpustakaan;

public abstract class Buku{
    String judul;
    String penulis;

    public Buku (String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    public String getJudul(){
        return judul;
    }

    public String getPenulis(){
        return penulis;
    }
    public void DisplayInfo(){
        //kosong
    }
}
