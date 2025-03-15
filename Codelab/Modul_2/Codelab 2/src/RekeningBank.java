import java.sql.SQLOutput;

public class RekeningBank {
    String nomorRekening; //atribut untuk menyimpan nomor rekening
    String namaPemilik; //atribut untuk menyimpan nama pemilik
    double saldo; //atribut untuk menyimpan saldo

    //method untuk menampilkan info
    void tampilkaninfo(){
        System.out.println("Nomor rekening :" + nomorRekening + "\nNama pemilik   : " + namaPemilik +"\nSaldo          : Rp "+ saldo);
        System.out.println();
    }

    //method untuk menyetorkan uang ke rekening
    void setorUang(double jumlah){
        saldo += jumlah;
        System.out.println(namaPemilik + " Menyetor Rp " + jumlah + " Saldo sekarang : Rp " + saldo);
        System.out.println();
    }

    //method untuk menarik uang dari rekening
    void tarikUang(double jumlah) {
        if (jumlah > saldo) { //mengecek apakah saldo bisa ditarik atau tidak
            System.out.println(namaPemilik + " Menarik Rp :" + jumlah + " .(Gagal, Saldo tidak mencukupi) Saldo saat ini : Rp " + saldo);
        } else {
            saldo -= jumlah;
            System.out.println(namaPemilik + " Menarik Rp : " + jumlah + " .(Berhasil) saldo sekarang : Rp " + saldo);
        }
    }
}
