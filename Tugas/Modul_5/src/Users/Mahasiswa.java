package Users;
import Actions.MahasiswaAction;
import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaAction {
    public Mahasiswa(String Nama, String Nim) {
        super(Nama, Nim);
    }

    @Override
    public void login() {
        if (getNama().equalsIgnoreCase("Dicky Habib Putra Hidayatullah") &&
                getNim().equals("202410370110208")) {
            System.out.println("Login Mahasiswa Berhasil!");
            System.out.println();
            DisplayInfo();
        } else {
            System.out.println("Login anda gagal! Nama atau NIM salah.");
        }
    }

    @Override
    public void DisplayInfo(){
        System.out.println("--- Informasi Mahasiswa ---");
        System.out.println("Nama = " + getNama());
        System.out.println("Nim = " + getNim());
        System.out.println();
    }

    @Override
    public void DisplayAppMenu(){
        try (Scanner scanner = new Scanner(System.in)){
            int pilihan;

            do{
                System.out.println("---Menu Mahasiswa---");
                System.out.println("1. Laporkan barang temuan / hilang ");
                System.out.println("2. Lihat daftar Laporan ");
                System.out.println("0. Logout ");
                System.out.print("Pilih Menu = ");
                pilihan = scanner.nextInt();
                scanner.nextLine();

                if (pilihan == 1){
                    reportItems();
                } else if (pilihan == 2 ) {
                    viewReportItems();
                } else if (pilihan == 0) {
                    System.out.println("Logout berhasil.");
                }else {
                    System.out.println("Pilihan tidak valid, Silahkan coba lagi.");
                }
            }while (pilihan !=0);
        }
    }

    @Override
    public void reportItems(){
        System.out.println("---Fitur laporan barang temuan / hilang masih belum tersedia---");
        System.out.println();
    }

    @Override
    public void viewReportItems(){
        System.out.println("--- Fitur lihat daftar barang hilang masih belum tersedia---");
        System.out.println();
    }
}
