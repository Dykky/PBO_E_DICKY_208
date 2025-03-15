import java.sql.SQLOutput;

public class RekeningBank {
    String nomorRekening;
    String namaPemilik;
    double saldo;

    void tampilkaninfo(){
        System.out.println("Nomor rekening :" + nomorRekening + "\nNama pemilik   : " + namaPemilik +"\nSaldo          : Rp "+ saldo);
        System.out.println();
    }

    void setorUang(double jumlah){
        saldo += jumlah;
        System.out.println(namaPemilik + " Menyetor Rp " + jumlah + " Saldo sekarang : Rp " + saldo);
        System.out.println();
    }

    void tarikUang(double jumlah) {
        if (jumlah > saldo) {
            System.out.println(namaPemilik + " Menarik Rp :" + jumlah + " .(Gagal, Saldo tidak mencukupi) Saldo saat ini : Rp " + saldo);
        } else {
            saldo -= jumlah;
            System.out.println(namaPemilik + " Menarik Rp : " + jumlah + " .(Berhasil) saldo sekarang : Rp " + saldo);
        }
    }
}
