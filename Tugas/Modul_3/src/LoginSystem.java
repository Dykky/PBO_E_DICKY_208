import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        int pilihan;


        Scanner objInput = new Scanner(System.in);


        System.out.println("Pilih login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan Pilihan: ");
        pilihan = objInput.nextInt();
        objInput.nextLine();


        if (pilihan == 1) {
            System.out.print("Masukkan username: ");
            String username = objInput.nextLine();
            System.out.print("Masukkan password: ");
            String password = objInput.nextLine();

            Admin adminObj = new Admin(username, password);
            adminObj.Login();

        } else if (pilihan == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = objInput.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = objInput.nextLine();

            Mahasiswa mahasiswaObj = new Mahasiswa(nama, nim);
            mahasiswaObj.Login();

        } else {
            System.out.println("Pilihan tidak valid.");
        }

        objInput.close();
    }
}