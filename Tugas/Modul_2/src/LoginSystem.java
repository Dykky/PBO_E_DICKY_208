import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        int pilihan;
        Scanner objInputan = new Scanner(System.in);

        Admin adminObj = new Admin();
        Mahasiswa mahasiswaObj = new Mahasiswa();

        System.out.println("Pilihan Login : ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan : ");
        pilihan = objInputan.nextInt();
        objInputan.nextLine();

        if (pilihan == 1) {
            System.out.print("Masukkan username : ");
            adminObj.Username = objInputan.nextLine();
            System.out.print("Masukkan Password : ");
            adminObj.Password = objInputan.nextLine();
            adminObj.Login();

        } else if (pilihan == 2) {
            System.out.print("Masukan Nama: ");
            mahasiswaObj.Nama = objInputan.nextLine();
            System.out.print("Masukan Nim: ");
            mahasiswaObj.Nim = objInputan.nextLine();
            mahasiswaObj.Login();

        } else {
            System.out.println("Eror");
        }

        objInputan.close();
    }
}