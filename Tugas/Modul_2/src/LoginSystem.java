import java.util.Scanner;

public class LoginSystem { //class login system atau kelas utama
    public static void main(String[] args) { //PSVM
        int pilihan; //variabel untuk menyimpan pilihan user
        Scanner objInputan = new Scanner(System.in); //pembuatan objek untuk inputan user

        Admin adminObj = new Admin(); //pembuatan objek untuk membaca inputan admin
        Mahasiswa mahasiswaObj = new Mahasiswa(); //pembuatan objek untuk membaca inputan mahasiswa

        //output
        System.out.println("Pilihan Login : ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan : ");
        pilihan = objInputan.nextInt(); //membaca pilihan user
        objInputan.nextLine();

        if (pilihan == 1) { //pilihan user jika user memilih n=angka 1
            System.out.print("Masukkan username : ");
            adminObj.Username = objInputan.nextLine();
            System.out.print("Masukkan Password : ");
            adminObj.Password = objInputan.nextLine();
            adminObj.Login(); //memanggil method login Admin

        } else if (pilihan == 2) {
            System.out.print("Masukan Nama: ");
            mahasiswaObj.Nama = objInputan.nextLine();
            System.out.print("Masukan Nim: ");
            mahasiswaObj.Nim = objInputan.nextLine();
            mahasiswaObj.Login(); //memanggil method login mahasiswa

        } else {
            System.out.println("Eror"); //outputan jika user memilih selain pilihan 1 dan 2
        }

        objInputan.close(); //mencegah kebocoran data atau sumber daya
    }
}