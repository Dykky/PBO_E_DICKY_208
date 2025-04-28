class Mahasiswa extends User {
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    void Login() {
        if (getNama().equals("Dicky Habib Putra Hidayatullah") && getNim().equals("202410370110208") || getNim().equals("208")) { //data login user untuk mengecek benar atau salahnya login mahasiswa
            System.out.println("Login Mahasiswa berhasil!"); //output jika login mahasiswa berhasil
            DisplayInfo(); //untuk menampilkan atau memanggil display info
        } else {
            System.out.println("Login Gagal! Nama atau Nim salah."); //output jika login mahasiswa salah

        }
    }

    @Override
    void DisplayInfo(){ //method display info untuk menampilkan infomasi login mahasiswa
        System.out.println("Data Login Mahasiswa : ");
        System.out.println("Nama : " + getNama());
        System.out.println("Nim : " + getNim());
    }
}
