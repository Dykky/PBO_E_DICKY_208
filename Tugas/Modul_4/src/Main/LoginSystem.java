package Main;
import Users.Admin;
import Users.Mahasiswa;
import Users.User;

import java.util.Scanner;
public class LoginSystem {
    public static void main(String[] args) {
        Scanner objInput = new Scanner(System.in);
        User userobj = null;

        System.out.println("---Sistem Login---");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.println("Masukkan Pilihan = ");
        int pilihan = objInput.nextInt();
        objInput.nextLine();

        if(pilihan==1){
            System.out.println("Masukkan Username =");
            String Username = objInput.nextLine();

            System.out.println("Masukkan Password = ");
            String Password = objInput.nextLine();

            Admin adminobj = new Admin(Username, Password);
            adminobj.Login();

            if(Username.equalsIgnoreCase("Admin208")&& Password.equalsIgnoreCase("Password208")){
                userobj = adminobj;
            }
        } else if (pilihan == 2) {
            System.out.println("Masukkan Nama = ");
            String Nama = objInput.nextLine();

            System.out.println("Masukkan Nim = ");
            String Nim = objInput.nextLine();

            Mahasiswa mahasiswaobj = new Mahasiswa(Nama, Nim);
            mahasiswaobj.Login();

            if (Nama.equalsIgnoreCase("Dicky Habib Putra Hidayatullah")&& Nim.equals("202410370110208")){
                userobj = mahasiswaobj;
            }
        }else {
            System.out.println("Pilihan tidak valid. Silakan pilih 1 atau 2.");
        }

        if (userobj !=null){
            userobj.DisplayAppMenu();
        }else {
            System.out.println("Loginn gagal, tidak ada user yang dapat diproses");
        }

        objInput.close();
    }
}