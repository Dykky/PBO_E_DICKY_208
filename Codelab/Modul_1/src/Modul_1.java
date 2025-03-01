import java.time.LocalDate;
import java.util.Scanner;

public class Modul_1 {
    public static void main(String[] args){
        String nama;
        char gender;
        int TahunLahir;
        Scanner objInput = new Scanner(System.in);
        //Input
        System.out.print("Masukkan nama anda : ");
        nama = objInput.nextLine();
        System.out.print("Masukkan Jenis kelamin anda (P/L): ");
        gender = objInput.next().charAt(0);
        System.out.print("Masukkan Tahun lahir anda : ");
        TahunLahir = objInput.nextInt();
        int TahunSekarang = LocalDate.now().getYear();
        int umur = TahunSekarang-TahunLahir;
        //Output
        if (gender == 'L' || gender == 'l') {
            System.out.print("\nData Diri: \n Nama          :" + nama + "\n Jenis Kelamin : Laki-Laki \n Umur          : " + umur);
        }else if (gender == 'P' || gender == 'p'){
            System.out.println("\nData Diri : \n Nama          :" + nama + "\n Jenis Kelamin : Perempuan \n Umur          : " + umur);
        }else{
            System.out.println("Masukkan Gender sesuai opsi pilihan (P/L) ");
        }
    }
}
