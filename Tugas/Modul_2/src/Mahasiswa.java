public class Mahasiswa {
    String Nama;
    String Nim;

    void Login(){
        if (Nama.equals("Dicky Habib Putra Hidayatullah")&& Nim.equals("202410370110208") || Nim.equals("208")){
            System.out.println("Login Mahasiswa berhasil!");
            Displayinfo();
        }else {
            System.out.println("Login Gagal! Nama atau Nim salah.");
        }
    }

    void Displayinfo(){
        System.out.println("Data Login Mahasiswa : ");
        System.out.println("Nama : " + Nama);
        System.out.println("Nim : " + Nim);
    }
}
