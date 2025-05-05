package App;
import Perpustakaan.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Buku buku1 = new NonFiksi("Gwrowth Hacker Marketing", "Ryan Holiday", "Bisnis dan Investasi");
        Buku buku2 = new Fiksi("Komik Tahilalats", "Nurfadli Musyid", "Komedi");
        buku1.DisplayInfo();
        buku2.DisplayInfo();

        Anggota aku = new Anggota("Dicky Habib Putra H","E208");
        Anggota teman = new Anggota("Iqodhul Himam ","E179");
        System.out.println();

        aku.pinjamBuku(buku1.getJudul());
        System.out.println();

        teman.pinjamBuku(buku2.getJudul());
        teman.pinjamBuku("Komik Tahilalats", 7);
        System.out.println();


        aku.kembalikanBuku(buku1.getJudul());
        teman.kembalikanBuku(buku2.getJudul());
    }
}