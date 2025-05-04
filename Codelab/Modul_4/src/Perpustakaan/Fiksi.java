package Perpustakaan;

public class Fiksi extends Buku {
    private String Genre;

    public Fiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        Genre = genre;
    }

    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println("Jenis buku fiksi");
        System.out.println("Judul buku = " + judul);
        System.out.println("Nama penulis = " + penulis);
        System.out.println("Genre = " + Genre);
        System.out.println();
    }
}
