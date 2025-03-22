
public class Main {
    public static void main(String[] args) {
        //membuat objek-objek dari semua class
        karakterGame KarakterUmum=new karakterGame("Karakter umum", 100);
        Pahlawan Brimstone=new Pahlawan("Brimstone", 150);
        Musuh Viper=new Musuh("Viper", 200);
        //menampilkan status awal
        System.out.println(" ---- STATUS AWAL ----");
        System.out.println(Brimstone.getnama() + " Memiliki kesehatan " + Brimstone.getkesehatan());
        System.out.println(Viper.getnama() + " Memiliki kesehatan " + Viper.getkesehatan());
        System.out.println();
        //method untuk memanggil method serang
        Brimstone.serang(Viper);
        Viper.serang(Brimstone);
    }
}