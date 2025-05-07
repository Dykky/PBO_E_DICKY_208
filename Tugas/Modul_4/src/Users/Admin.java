package Users;

import actions.AdminAction;
import java.util.Scanner;
public class Admin extends User implements AdminAction {
    private String Username;
    private String Password;

    public Admin(String Username, String Password){
        super("Dicky Habib Putra Hidayatullah", "202410370110208");
        this.Username = Username;
        this.Password = Password;
    }

    @Override
    public void Login(){
        if (Username.equalsIgnoreCase("Admin208")&& Password.equalsIgnoreCase("Password208")){
            System.out.println("Login Admin Berhasil");
        }else {
            System.out.println("Login anda gagal! Username atau Password salah.");
        }
    }

    @Override
    public void DisplayInfo(){
        System.out.println("---Informasi Admin---");
        System.out.println("Nama = " + getNama());
        System.out.println("Nim = " + getNim());
        System.out.println("Username = " + Username);
    }

    @Override
    public void DisplayAppMenu(){
        try(Scanner scanner=new Scanner(System.in)){
            int pilihan;

            do {
                System.out.println("---Menu Admin---");
                System.out.println("1. Kelola laporan barang ");
                System.out.println("2. Kelola data Mahasiswa ");
                System.out.println("0. Logout");
                System.out.println("Pilih Menu = ");
                pilihan = scanner.nextInt();
                scanner.nextLine();

                if (pilihan == 1){
                    manageItems();
                } else if (pilihan == 2) {
                    manageUsers();
                } else if (pilihan == 0) {
                    System.out.println("Logout berhasil. ");
                }else {
                    System.out.println("Pilihan tidak valid, Silahkan coba lagi.");
                }
            }while (pilihan !=0);
        }
    }

    @Override
    public void manageItems(){
        System.out.println("---Fitur kelola barang masih belum tersedia--- ");
    }

    @Override
    public void manageUsers(){
        System.out.println("---Fitur kelola Mahasiswa masih belum tersedia---");
    }
}
