package Users;
import Actions.AdminAction;
import Models.Item;

import java.util.Scanner;
import java.util.InputMismatchException;

import static Main.LoginSystem.*;

public class Admin extends User implements AdminAction {
    private String Username;
    private String Password;

    public Admin(String Username, String Password) {
        super(Username, Password);
        this.Username = Username;
        this.Password = Password;
    }

    public Admin (){
        super("","");
    }

    public String getUsername(){
        return Username;
    }

    public void setUsername(String username){
        this.Username = username;
    }

    public String getPassword(){
        return Password;
    }

    public void setPassword(String password){
        this.Password = password;
    }

    @Override
    public void DisplayInfo() {
        System.out.println("Login Admin berhasil");
        System.out.println("Username = " + Username);
        System.out.println();
    }

    @Override
    public void DisplayAppMenu() {
        try (Scanner scanner = new Scanner(System.in)) {
            int pilihan;

            do {
                System.out.println("---Menu Admin---");
                System.out.println("1. Kelola laporan barang ");
                System.out.println("2. Kelola data Mahasiswa ");
                System.out.println("0. Logout");
                System.out.print("Pilih Menu = ");
                pilihan = scanner.nextInt();
                scanner.nextLine();

                if (pilihan == 1) {
                    manageItems();
                } else if (pilihan == 2) {
                    manageUsers();
                } else if (pilihan == 0) {
                    System.out.println("Logout berhasil. ");
                } else {
                    System.out.println("Pilihan tidak valid, Silahkan coba lagi.");
                }
            } while (pilihan != 0);
        }
    }

    @Override
    public void manageItems() {
        try {
            System.out.println("Menu kelola Laporan Kehilangan:");
            System.out.println("1. Lihat semua barang");
            System.out.println("2. tandai barang yang sudah diambil(Claimed)");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            int pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                System.out.println("==============================================================================");
                System.out.println("| Name            | Description               | Location        | Status     |");
                System.out.println("==============================================================================");
                for (Item item : itemList) {
                    System.out.println(item);
                    System.out.println("==============================================================================");
                }
            } else if (pilihan == 2) {
                System.out.println("==============================================================================");
                System.out.println("No | Name            | Description               | Location        | Status     |");
                System.out.println("==============================================================================");
                for (int i = 0; i < itemList.size(); i++) {
                    System.out.println(i + ". |" + "\t" + itemList.get(i).getItemName() + "\t" + itemList.get(i).getDescription() + "\t" + itemList.get(i).getLocation() + "\t" + itemList.get(i).getStatus());
                    System.out.println("==============================================================================");
                }
                System.out.print("Masukkan index yang ingin dirubah: ");
                try {
                    int index = input.nextInt();
                    input.nextLine();
                    if (index >= 0 && index < itemList.size()) {
                        itemList.get(index).setStatus("Claimed");
                        System.out.println("Status berhasil dirubah.");
                    } else {
                        System.out.println("Index tidak valid.");
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Index melebihi batas.");
                } catch (InputMismatchException e) {
                    System.out.println("Input harus berupa angka.");
                    input.nextLine();
                }
            } else if (pilihan == 0) {
                System.out.println("Keluar dari menu.");
            } else {
                System.out.println("Pilihan tidak valid.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka.");
            input.nextLine();
        }
    }

    @Override
    public void manageUsers() {
        int pilihan = 0;
        String nama;
        String nim;
        boolean con = true;

        do {
            System.out.println("Menu kelola data mahasiswa:");
            System.out.println("1. Tambah mahasiswa");
            System.out.println("2. Hapus mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");

            try {
                pilihan = input.nextInt();
                input.nextLine();

                if (pilihan == 1) {
                    System.out.printf("Masukkan Nama Mahasiswa: ");
                    nama = input.nextLine();
                    System.out.printf("Masukkan Nim Mahasiswa: ");
                    nim = input.nextLine();

                    userList.add(new Mahasiswa(nama, nim));
                    System.out.println("Mahasiswa ditambahkan.");
                    System.out.println();
                    con = false;
                } else if (pilihan == 2) {
                    System.out.printf("Masukkan Nim Mahasiswa: ");
                    nim = input.nextLine();

                    boolean ditemukan = false;
                    for (int i = 0; i < userList.size(); i++) {
                        User user = userList.get(i);
                        if (user instanceof Mahasiswa) {
                            Mahasiswa mhs = (Mahasiswa) user;
                            if (mhs.getNim().equals(nim)) {
                                userList.remove(i);
                                System.out.println("Mahasiswa dihapus.");
                                ditemukan = true;
                                con = false;
                                break;
                            }
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
                    }
                } else if (pilihan == 0) {
                    System.out.println("Terimakasih telah menggunakan sistem kami !!!!");
                    con = false;
                } else {
                    System.out.println("Pilihan tidak valid.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                input.nextLine();
            }

        } while (con);
    }

}