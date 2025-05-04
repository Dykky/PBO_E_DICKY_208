package Perpustakaan;

public class Anggota implements Peminjaman {
    String Nama;
    String IdAnggota;

    public Anggota(String nama, String idAnggota) {
        this.Nama = nama;
        this.IdAnggota = idAnggota;

        System.out.println("Anggota = " + nama + " (ID = " + IdAnggota + ")");
    }
    @Override
    public void pinjamBuku(String judul) {
        System.out.println(Nama + "Meminjam buku berjudul = " + judul);
    }

    public void kembalikanBuku(String judul) {
        System.out.println(Nama + "Mengembalikan buku berjudul = " + judul);
    }
}
