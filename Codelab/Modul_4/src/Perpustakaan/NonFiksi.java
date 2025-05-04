package Perpustakaan;

public class NonFiksi extends Buku {
    private String Topik;

    public NonFiksi(String judul, String penulis, String topik) {
        super(judul, penulis);
        this.Topik = topik;
    }

    @Override
    public void DisplayInfo(){
        super.DisplayInfo();
        System.out.println("Jenis buku = Non-Fiksi");
        System.out.println("Judul buku = " + judul);
        System.out.println("Nama Penulis = " + penulis);
        System.out.println("Genre = " + Topik);
        System.out.println();
    }
}
