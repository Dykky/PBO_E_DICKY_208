public class Mahasiswa { //class untuk mahasiswa
    String Nama; //variabel nama untuk menyimpan nama user
    String Nim; //variabel nama untuk menyimpan nim user

    void Login(){ //method login untuk menyimpan info login user
        if (Nama.equalsIgnoreCase("Dicky Habib Putra Hidayatullah")&& Nim.equals("202410370110208") || Nim.equals("208")){ //data login user untuk mengecek benar atau salahnya login mahasiswa
            System.out.println("Login Mahasiswa berhasil!"); //output jika login mahasiswa berhasil
            Displayinfo(); //untuk menampilkan atau memanggil display info
        }else {
            System.out.println("Login Gagal! Nama atau Nim salah."); //output jika login mahasiswa salah
        }
    }

    void Displayinfo(){ //method display info untuk menampilkan infomasi login mahasiswa
        System.out.println("Data Login Mahasiswa : ");
        System.out.println("Nama : " + Nama);
        System.out.println("Nim : " + Nim);
    }
}
