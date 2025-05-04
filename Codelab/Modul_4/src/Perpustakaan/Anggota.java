package Perpustakaan;

public class Anggota implements Peminjaman {
    String Nama;
    String IdAnggota;

    public Anggota(String nama, String idAnggota) {
        this.Nama = nama;
        this.IdAnggota = idAnggota;

        System.out.println(" Anggota = " + nama + " (ID = " + IdAnggota + ")");
    }
    @Override
    public void pinjamBuku(String judul) {
        System.out.println("Buku " + judul + " dipinjam oleh " + Nama);
    }

    public void pinjamBuku(String judul, int durasi){
        System.out.println("Buku " + judul + " dipinjam selama " + durasi + "hari, oleh " + Nama );
    }

    public void kembalikanBuku(String judul) {
        System.out.println("Buku " + judul + " dikembalikan oleh " + Nama);
    }
}
