package Main;

import Models.Item;
import Users.Admin;
import Users.Mahasiswa;
import Users.User;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginSystem {

    public static ArrayList<User> userList = new ArrayList<>();
    public static ArrayList<Item> itemList = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);

    static {
        userList.add(new Mahasiswa("Dicky Habib Putra H", "202410370110208"));
        userList.add(new Mahasiswa("Devano Aghanza P P", "202410370110211"));
        userList.add(new Admin("Admin", "Admin208"));
    }

    public static User login(String user, String pass) {
        for (User users : userList) {
            if (users instanceof Mahasiswa mhs && mhs.getNama().equalsIgnoreCase(user) && mhs.getNim().equalsIgnoreCase(pass)) {
                return mhs;
            } else if (users instanceof Admin admin && admin.getNama().equalsIgnoreCase(user) && admin.getNim().equalsIgnoreCase(pass)) {
                return admin;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pilihan;
        int limit = 0;
        boolean isRunning = true;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Login");
            System.out.println("2. Keluar");
            System.out.print("Masukkan pilihan: ");
            try {
                pilihan = scanner.nextInt();
                scanner.nextLine();

                if (pilihan == 1) {
                    System.out.print("Masukkan username/nama: ");
                    String inUser = scanner.nextLine();
                    System.out.print("Masukkan password/nim: ");
                    String pass = scanner.nextLine();

                    User userLoggined = login(inUser, pass);

                    if (userLoggined != null) {
                        System.out.println("\nSelamat Datang!");
                        userLoggined.DisplayInfo();
                        userLoggined.DisplayAppMenu();
                    } else {
                        System.out.println("Password atau username salah.");
                        limit++;
                    }

                } else if (pilihan == 2) {
                    System.out.println("Terimakasih telah menggunakan sistem kami!!!");
                    isRunning = false;
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                scanner.nextLine();
                limit++;
            }

        } while (isRunning && limit < 3);

        if (limit >= 3) {
            System.out.println("Terlalu banyak percobaan login gagal. Aplikasi keluar.");
        }
    }
}
