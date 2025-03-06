import javax.naming.Name;
import java.util.Scanner;

public class TugasModul_1 {
    public static void main(String[] args) {
        String Username;
        String Password;
        String Nama;
        String Nim;
        int pilihan;

        Scanner objInputan = new Scanner(System.in);

        System.out.println("Pilih Login : ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan : ");
        pilihan = objInputan.nextInt();
        objInputan.nextLine();

        if (pilihan == 1){
            System.out.print("Masukkan username : ");
            Username =objInputan.nextLine();
            System.out.print("Masukkan Password : ");
            Password  = objInputan.nextLine();

            if (Username.equals("Admin208")&& Password.equals("Password208")){
                System.out.println("Login Admin berhasil !");
            }else {
                System.out.println("Login Gagal ! Username atau Password salah.");
            }
        }else if (pilihan == 2){
            System.out.print("Masukkan Nama : ");
            Nama =objInputan.nextLine();
            System.out.print("Masukkan Nim : ");
            Nim =objInputan.nextLine();

            if (Nama.equals("Dicky Habib Putra Hidayatullah")&& Nim.equals("202410370110208") || Nim.equals("208")){
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama : " + Nama);
                System.out.println("Nim : " + Nim);
            }else {
                System.out.println("Login Gagal! Nama atau Nim salah.");
            }
        }else {
            System.out.println("Pilihan Tidak Valid!!!");
        }
        objInputan.close();
    }
}