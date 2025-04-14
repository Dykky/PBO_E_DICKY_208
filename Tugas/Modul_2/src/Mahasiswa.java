public class Mahasiswa {
    String Nama;
    String Nim;

    Void Login(){
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
    }
}
