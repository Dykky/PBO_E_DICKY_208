package Users;
import Actions.MahasiswaAction;
import Models.Item;

import java.util.Scanner;

import static Main.LoginSystem.input;
import static Main.LoginSystem.itemList;

public class Mahasiswa extends User implements MahasiswaAction {
    public Mahasiswa(String Nama, String Nim) {
        super(Nama, Nim);
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
        String itemName;
        String description;
        String location;

        System.out.printf("Nama Barang yang hilang atau ditemukan: ");
        itemName = input.nextLine();
        System.out.printf("Deskripsi Barang: ");
        description = input.nextLine();
        System.out.printf("Lokasi ditemukan: ");
        location = input.nextLine();

        itemList.add(new Item(itemName,description,location));
        viewReportItems();
    }

    @Override
    public void viewReportItems(){
        for (Item item : itemList){
            System.out.println("==============================================================================");
            System.out.println("| Name            | Description               | Location        | Status     |");
            System.out.println("==============================================================================");
            System.out.println(item);
            System.out.println("==============================================================================");
        }
    }

}
